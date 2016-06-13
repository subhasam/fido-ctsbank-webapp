package poc.ctsbank.fido.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    /**
     * Method initialize.
     * @param constraintAnnotation PasswordMatches
     */
    @Override
    public void initialize(final PasswordMatches constraintAnnotation) {
        //
    }

    /**
     * Method isValid.
     * @param obj Object
     * @param context ConstraintValidatorContext
     * @return boolean
     */
    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final AccountOwnerDTO accOwnerDTO = (AccountOwnerDTO) obj;
        return accOwnerDTO.getPassword().equals(accOwnerDTO.getMatchingPassword());
    }

}
