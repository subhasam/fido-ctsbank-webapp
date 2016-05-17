package poc.ctsbank.fido.registration;

import java.util.Locale;

import org.springframework.context.ApplicationEvent;

import poc.ctsbank.fido.persistence.model.AccountOwner;

@SuppressWarnings("serial")
public class AccountRegistrationEvent extends ApplicationEvent {

    private final String appUrl;
    private final Locale locale;
    private final AccountOwner accountOwner;

    public AccountRegistrationEvent(final AccountOwner accountOwner, final Locale locale, final String appUrl) {
        super(accountOwner);
        this.accountOwner = accountOwner;
        this.locale = locale;
        this.appUrl = appUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public Locale getLocale() {
        return locale;
    }

	public AccountOwner getAccountOwner() {
        return accountOwner;
    }

}
