package poc.ctsbank.fido.registration;

import org.springframework.context.ApplicationEvent;

import poc.ctsbank.fido.persistence.model.AccountOwner;

@SuppressWarnings("serial")
public class AccountRegistrationEvent extends ApplicationEvent {

    private final AccountOwner accountOwner;

    public AccountRegistrationEvent(final AccountOwner accountOwner) {
        super(accountOwner);
        this.accountOwner = accountOwner;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

}
