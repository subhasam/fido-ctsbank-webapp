package poc.ctsbank.fido.validation;

import javax.validation.ConstraintValidatorContext;
import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PasswordMatchesValidatorTest</code> contains tests for the class <code>{@link PasswordMatchesValidator}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class PasswordMatchesValidatorTest {
	/**
	 * Run the void initialize(PasswordMatches) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		PasswordMatchesValidator fixture = new PasswordMatchesValidator();
		PasswordMatches constraintAnnotation = null;

		fixture.initialize(constraintAnnotation);

		//TODO
	}

	/**
	 * Run the boolean isValid(Object,ConstraintValidatorContext) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		PasswordMatchesValidator fixture = new PasswordMatchesValidator();
		AccountOwnerDTO obj = new AccountOwnerDTO();
		obj.setPassword("");
		obj.setMatchingPassword("");
		ConstraintValidatorContext context = null;

		boolean result = fixture.isValid(obj, context);

		//TODO
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isValid(Object,ConstraintValidatorContext) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		PasswordMatchesValidator fixture = new PasswordMatchesValidator();
		AccountOwnerDTO obj = new AccountOwnerDTO();
		obj.setPassword("");
		obj.setMatchingPassword("");
		ConstraintValidatorContext context = null;

		boolean result = fixture.isValid(obj, context);

		//TODO
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 *
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
	 *
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
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PasswordMatchesValidatorTest.class);
	}
}