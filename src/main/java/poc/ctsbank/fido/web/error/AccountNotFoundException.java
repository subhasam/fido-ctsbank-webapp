package poc.ctsbank.fido.web.error;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public final class AccountNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366287163L;

    public AccountNotFoundException() {
        super();
    }

    /**
     * Constructor for AccountNotFoundException.
     * @param message String
     * @param cause Throwable
     */
    public AccountNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for AccountNotFoundException.
     * @param message String
     */
    public AccountNotFoundException(final String message) {
        super(message);
    }

    /**
     * Constructor for AccountNotFoundException.
     * @param cause Throwable
     */
    public AccountNotFoundException(final Throwable cause) {
        super(cause);
    }

}
