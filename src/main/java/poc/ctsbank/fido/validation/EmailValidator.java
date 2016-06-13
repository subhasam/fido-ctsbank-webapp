package poc.ctsbank.fido.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Method initialize.
     * @param constraintAnnotation ValidEmail
     */
    @Override
    public void initialize(final ValidEmail constraintAnnotation) {
    }

    /**
     * Method isValid.
     * @param username String
     * @param context ConstraintValidatorContext
     * @return boolean
     */
    @Override
    public boolean isValid(final String username, final ConstraintValidatorContext context) {
        return (validateEmail(username));
    }

    /**
     * Method validateEmail.
     * @param email String
     * @return boolean
     */
    private boolean validateEmail(final String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
