package poc.ctsbank.fido.registration;

import org.springframework.context.ApplicationEvent;

import poc.ctsbank.fido.persistence.model.AccountOwner;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
public class AccountRegistrationEvent extends ApplicationEvent {

    private final AccountOwner accountOwner;

    /**
     * Constructor for AccountRegistrationEvent.
     * @param accountOwner AccountOwner
     */
    public AccountRegistrationEvent(final AccountOwner accountOwner) {
        super(accountOwner);
        this.accountOwner = accountOwner;
    }

    /**
     * Method getAccountOwner.
     * @return AccountOwner
     */
    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

}
