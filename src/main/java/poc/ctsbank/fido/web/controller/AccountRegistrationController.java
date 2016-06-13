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
import poc.ctsbank.fido.web.util.GenericAccountRegistrationRes;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Controller
public class AccountRegistrationController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    @Autowired
    private MessageSource messages;    

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private Environment env;

    public AccountRegistrationController() {
        super();
    }

    // Registration

    /**
     * Method registerUserAccount.
     * @param accountDto AccountOwnerDTO
     * @param request HttpServletRequest
     * @return GenericAccountRegistrationRes
     */
    @RequestMapping(value = "/account/registration", method = RequestMethod.POST)
    @ResponseBody
    public GenericAccountRegistrationRes registerUserAccount(@Valid final AccountOwnerDTO accountDto, final HttpServletRequest request) {
        LOGGER.debug("Registering user account with information: {}", accountDto);

        final AccountOwner registered = accountService.registerAccount(accountDto);
        eventPublisher.publishEvent(new AccountRegistrationEvent(registered));
        return new GenericAccountRegistrationRes("success");
    }

    /**
     * Method confirmRegistration.
     * @param locale Locale
     * @param model Model
     * @param token String
     * @return String
     */
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

    /**
     * Method getAppUrl.
     * @param request HttpServletRequest
     * @return String
     */
    private String getAppUrl(HttpServletRequest request) {
        return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    }

}
