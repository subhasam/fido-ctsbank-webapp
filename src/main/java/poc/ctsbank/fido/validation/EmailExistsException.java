package poc.ctsbank.fido.validation;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("serial")
public class EmailExistsException extends Throwable {

    /**
     * Constructor for EmailExistsException.
     * @param message String
     */
    public EmailExistsException(final String message) {
        super(message);
    }

}
