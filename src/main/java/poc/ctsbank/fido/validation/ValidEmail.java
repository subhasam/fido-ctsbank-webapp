package poc.ctsbank.fido.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {

    /**
     * Method message.
     * @return String
     */
    String message() default "Invalid Email";

    /**
     * Method groups.
     * @return Class<?>[]
     */
    Class<?>[] groups() default {};

    /**
     * Method payload.
     * @return Class<? extends Payload>[]
     */
    Class<? extends Payload>[] payload() default {};
}
