package poc.ctsbank.fido.validation;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EmailExistsExceptionTest</code> contains tests for the class <code>{@link EmailExistsException}</code>.
 *
 * @generatedBy CodePro at 6/12/16 7:56 PM
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class EmailExistsExceptionTest {
	/**
	 * Run the EmailExistsException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testEmailExistsException_1()
		throws Exception {
		String message = "";

		EmailExistsException result = new EmailExistsException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("poc.ctsbank.fido.validation.EmailExistsException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
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
		new org.junit.runner.JUnitCore().run(EmailExistsExceptionTest.class);
	}
}