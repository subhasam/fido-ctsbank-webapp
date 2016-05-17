package poc.ctsbank.fido.registration.listener;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.service.AccountService;
import poc.ctsbank.fido.registration.AccountRegistrationEvent;

@Component
public class RegistrationListener implements ApplicationListener<AccountRegistrationEvent> {
    @Autowired
    private AccountService accService;

    @Autowired
    private MessageSource messages;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Environment env;

    // API

    @Override
    public void onApplicationEvent(final AccountRegistrationEvent event) {
        this.confirmRegistration(event);
    }

    private void confirmRegistration(final AccountRegistrationEvent event) {
        final AccountOwner user = event.getAccountOwner();
        final String token = UUID.randomUUID().toString();
        accService.createVerificationTokenForUser(user, token);

        final SimpleMailMessage email = constructEmailMessage(event, user, token);
        mailSender.send(email);
    }

    //

    private final SimpleMailMessage constructEmailMessage(final AccountRegistrationEvent event, final AccountOwner user, final String token) {
        final String recipientAddress = user.getEmail();
        final String subject = "Registration Confirmation";
        final String confirmationUrl = event.getAppUrl() + "/regitrationConfirm.html?token=" + token;
        final String message = messages.getMessage("message.regSucc", null, event.getLocale());
        final SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message + " \r\n" + confirmationUrl);
        email.setFrom(env.getProperty("support.email"));
        return email;
    }

}
