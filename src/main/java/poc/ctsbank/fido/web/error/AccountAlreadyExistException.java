package poc.ctsbank.fido.web.error;

/**
 */
public final class AccountAlreadyExistException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366287163L;

    public AccountAlreadyExistException() {
        super();
    }

    /**
     * Constructor for AccountAlreadyExistException.
     * @param message String
     * @param cause Throwable
     */
    public AccountAlreadyExistException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for AccountAlreadyExistException.
     * @param message String
     */
    public AccountAlreadyExistException(final String message) {
        super(message);
    }

    /**
     * Constructor for AccountAlreadyExistException.
     * @param cause Throwable
     */
    public AccountAlreadyExistException(final Throwable cause) {
        super(cause);
    }

}
