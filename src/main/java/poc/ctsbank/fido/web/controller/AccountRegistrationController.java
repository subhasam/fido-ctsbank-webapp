package poc.ctsbank.fido.web.controller;

import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;
import poc.ctsbank.fido.persistence.service.AccountService;
import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;
import poc.ctsbank.fido.registration.AccountRegistrationEvent;
import poc.ctsbank.fido.web.error.AccountNotFoundException;
import poc.ctsbank.fido.web.util.GenericResponse;

@Controller
public class AccountRegistrationController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    @Autowired
    private MessageSource messages;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private Environment env;

    public AccountRegistrationController() {
        super();
    }

    // Registration

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    @ResponseBody
    public GenericResponse registerUserAccount(@Valid final AccountOwnerDTO accountDto, final HttpServletRequest request) {
        LOGGER.debug("Registering user account with information: {}", accountDto);

        final AccountOwner registered = accountService.registerAccount(accountDto);
        eventPublisher.publishEvent(new AccountRegistrationEvent(registered, request.getLocale(), getAppUrl(request)));
        return new GenericResponse("success");
    }

    @RequestMapping(value = "/regitrationConfirm", method = RequestMethod.GET)
    public String confirmRegistration(final Locale locale, final Model model, @RequestParam("token") final String token) {
        final String result = accountService.validateVerificationToken(token);
        if (result == null) {
            model.addAttribute("message", messages.getMessage("message.accountVerified", null, locale));
            return "redirect:/login?lang=" + locale.getLanguage();
        }
        if (result == "expired") {
            model.addAttribute("expired", true);
            model.addAttribute("token", token);
        }
        model.addAttribute("message", messages.getMessage("auth.message." + result, null, locale));
        return "redirect:/badUser.html?lang=" + locale.getLanguage();
    }

    // user activation - verification

    @RequestMapping(value = "/user/resendRegistrationToken", method = RequestMethod.GET)
    @ResponseBody
    public GenericResponse resendRegistrationToken(final HttpServletRequest request, @RequestParam("token") final String existingToken) {
        final VerificationToken newToken = accountService.generateNewVerificationToken(existingToken);
        final AccountOwner user = accountService.getAccountOwnerDetails(newToken.getToken());
        mailSender.send(constructResendVerificationTokenEmail(getAppUrl(request), request.getLocale(), newToken, user));
        return new GenericResponse(messages.getMessage("message.resendToken", null, request.getLocale()));
    }

    // Reset password
    @RequestMapping(value = "/user/resetPassword", method = RequestMethod.POST)
    @ResponseBody
    public GenericResponse resetPassword(final HttpServletRequest request, @RequestParam("email") final String userEmail) {
        final AccountOwner user = accountService.findAccountOwnerByEmail(userEmail);
        if (user == null) {
            throw new AccountNotFoundException();
        }
        final String token = UUID.randomUUID().toString();
        accountService.createPasswordResetTokenForUser(user, token);
        mailSender.send(constructResetTokenEmail(getAppUrl(request), request.getLocale(), token, user));
        return new GenericResponse(messages.getMessage("message.resetPasswordEmail", null, request.getLocale()));
    }

    @RequestMapping(value = "/user/changePassword", method = RequestMethod.GET)
    public String showChangePasswordPage(final Locale locale, final Model model, @RequestParam("id") final long id, @RequestParam("token") final String token) {
        final String result = accountService.validatePasswordResetToken(id, token);
        if (result != null) {
            model.addAttribute("message", messages.getMessage("auth.message." + result, null, locale));
            return "redirect:/login?lang=" + locale.getLanguage();
        }
        return "redirect:/updatePassword.html?lang=" + locale.getLanguage();
    }

    @RequestMapping(value = "/user/savePassword", method = RequestMethod.POST)
    @PreAuthorize("hasRole('READ_PRIVILEGE')")
    @ResponseBody
    public GenericResponse savePassword(final Locale locale, @RequestParam("password") final String password) {
        final AccountOwner user = (AccountOwner) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        accountService.changeAccountOwnerPassword(user, password);
        return new GenericResponse(messages.getMessage("message.resetPasswordSuc", null, locale));
    }

    private final SimpleMailMessage constructResendVerificationTokenEmail(final String contextPath, final Locale locale, final VerificationToken newToken, final AccountOwner user) {
        final String confirmationUrl = contextPath + "/regitrationConfirm.html?token=" + newToken.getToken();
        final String message = messages.getMessage("message.resendToken", null, locale);
        return constructEmail("Resend Registration Token", message + " \r\n" + confirmationUrl, user);
    }

    private final SimpleMailMessage constructResetTokenEmail(final String contextPath, final Locale locale, final String token, final AccountOwner user) {
        final String url = contextPath + "/user/changePassword?id=" + user.getId() + "&token=" + token;
        final String message = messages.getMessage("message.resetPassword", null, locale);
        return constructEmail("Reset Password", message + " \r\n" + url, user);
    }

    private SimpleMailMessage constructEmail(String subject, String body, AccountOwner user) {
        final SimpleMailMessage email = new SimpleMailMessage();
        email.setSubject(subject);
        email.setText(body);
        email.setTo(user.getEmail());
        email.setFrom(env.getProperty("support.email"));
        return email;
    }

    private String getAppUrl(HttpServletRequest request) {
        return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

}
