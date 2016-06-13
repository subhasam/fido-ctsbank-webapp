package poc.ctsbank.fido.validation;

import javax.validation.ConstraintValidatorContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmailValidatorTest</code> contains tests for the class <code>{@link EmailValidator}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class EmailValidatorTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public EmailValidatorTest(String name) {
	}

	/**
	 * Run the EmailValidator() constructor test.
	 *
	 *
	 */
	@Test
	public void testEmailValidator_1()
		throws Exception {
		EmailValidator result = new EmailValidator();
		assertNotNull(result);
		//TODO
	}

	/**
	 * Run the void initialize(ValidEmail) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		EmailValidator fixture = new EmailValidator();
		ValidEmail constraintAnnotation = null;

		fixture.initialize(constraintAnnotation);

		//TODO
	}

	/**
	 * Run the boolean isValid(String,ConstraintValidatorContext) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		EmailValidator fixture = new EmailValidator();
		String username = "";
		ConstraintValidatorContext context = null;

		boolean result = fixture.isValid(username, context);

		//TODO
		assertEquals(false, result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmailValidatorTest.class);
	}
}