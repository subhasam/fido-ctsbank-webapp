package poc.ctsbank.fido.validation;

import javax.validation.ConstraintValidatorContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PasswordConstraintValidatorTest</code> contains tests for the class <code>{@link PasswordConstraintValidator}</code>.
 *
 * @generatedBy CodePro at 6/12/16 7:56 PM
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class PasswordConstraintValidatorTest {
	/**
	 * Run the void initialize(ValidPassword) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		PasswordConstraintValidator fixture = new PasswordConstraintValidator();
		ValidPassword arg0 = null;

		fixture.initialize(arg0);

		//TODO
	}

	/**
	 * Run the boolean isValid(String,ConstraintValidatorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		PasswordConstraintValidator fixture = new PasswordConstraintValidator();
		String password = "";
		ConstraintValidatorContext context = null;

		boolean result = fixture.isValid(password, context);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.validation.PasswordConstraintValidator.isValid(PasswordConstraintValidator.java:48)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(String,ConstraintValidatorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		PasswordConstraintValidator fixture = new PasswordConstraintValidator();
		String password = "";
		ConstraintValidatorContext context = null;

		boolean result = fixture.isValid(password, context);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.validation.PasswordConstraintValidator.isValid(PasswordConstraintValidator.java:48)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PasswordConstraintValidatorTest.class);
	}
}