package poc.ctsbank.fido.web.error;

public final class AccountNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366287163L;

    public AccountNotFoundException() {
        super();
    }

    public AccountNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AccountNotFoundException(final String message) {
        super(message);
    }

    public AccountNotFoundException(final Throwable cause) {
        super(cause);
    }

}
