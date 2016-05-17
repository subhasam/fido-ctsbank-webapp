package poc.ctsbank.fido.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(final PasswordMatches constraintAnnotation) {
        //
    }

    @Override
    public boolean isValid(final Object obj, final ConstraintValidatorContext context) {
        final AccountOwnerDTO accOwnerDTO = (AccountOwnerDTO) obj;
        return accOwnerDTO.getPassword().equals(accOwnerDTO.getMatchingPassword());
    }

}
