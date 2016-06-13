package poc.ctsbank.fido.registration.listener;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.service.AccountService;
import poc.ctsbank.fido.registration.AccountRegistrationEvent;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Component
public class AccountAuthStatusListener implements ApplicationListener<AccountRegistrationEvent> {
    @Autowired
    private AccountService accService;

    @Autowired
    private MessageSource messages;

    /**
     * Method onApplicationEvent.
     * @param event AccountRegistrationEvent
     */
    @Override
    public void onApplicationEvent(final AccountRegistrationEvent event) {
        this.confirmRegistration(event);
    }
    
    /**
     * Method monitorStatusChange.
     * @param accAuthInitialStat String
     * @param event AccountRegistrationEvent
     * @return Object
     */
    public Object monitorStatusChange(String accAuthInitialStat, final AccountRegistrationEvent event){
    	String updatedAccAuthStat = null;
		return updatedAccAuthStat;    	
    }

    /**
     * Method confirmRegistration.
     * @param event AccountRegistrationEvent
     */
    private void confirmRegistration(final AccountRegistrationEvent event) {
        final AccountOwner user = event.getAccountOwner();
        final String token = UUID.randomUUID().toString();
        accService.createVerificationTokenForUser(user, token);
    }

}
