package poc.ctsbank.fido.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class AccountOwnerValidator implements Validator {

    /**
     * Method supports.
     * @param clazz Class<?>
     * @return boolean
     * @see org.springframework.validation.Validator#supports(Class<?>)
     */
    @Override
    public boolean supports(final Class<?> clazz) {
        return AccountOwnerDTO.class.isAssignableFrom(clazz);
    }

    /**
     * Method validate.
     * @param obj Object
     * @param errors Errors
     * @see org.springframework.validation.Validator#validate(Object, Errors)
     */
    @Override
    public void validate(final Object obj, final Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountOwnerFirstName", "message.firstName", "Firstname is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountOwnerLastName", "message.lastName", "LastName is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "message.password", "LastName is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "message.username", "UserName is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountNumber", "message.accountNumber", "Account Number is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "routingNumber", "message.routingNumber", "Bank Routing Number is required.");
    }

}
