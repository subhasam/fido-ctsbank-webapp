package poc.ctsbank.fido.web.util;

import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class GenericAccountRegistrationRes {
    private String message;
    private String error;

    /**
     * Constructor for GenericAccountRegistrationRes.
     * @param message String
     */
    public GenericAccountRegistrationRes(final String message) {
        super();
        this.message = message;
    }

    /**
     * Constructor for GenericAccountRegistrationRes.
     * @param message String
     * @param error String
     */
    public GenericAccountRegistrationRes(final String message, final String error) {
        super();
        this.message = message;
        this.error = error;
    }

    /**
     * Constructor for GenericAccountRegistrationRes.
     * @param fieldErrors List<FieldError>
     * @param globalErrors List<ObjectError>
     */
    public GenericAccountRegistrationRes(final List<FieldError> fieldErrors, final List<ObjectError> globalErrors) {
        super();
        final ObjectMapper mapper = new ObjectMapper();
        try {
            this.message = mapper.writeValueAsString(fieldErrors);
            this.error = mapper.writeValueAsString(globalErrors);
        } catch (final JsonProcessingException e) {
            this.message = "";
            this.error = "";
        }
    }

    /**
     * Method getMessage.
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Method setMessage.
     * @param message String
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Method getError.
     * @return String
     */
    public String getError() {
        return error;
    }

    /**
     * Method setError.
     * @param error String
     */
    public void setError(final String error) {
        this.error = error;
    }

}
