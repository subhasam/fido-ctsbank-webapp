package poc.ctsbank.fido.web.error;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AccountAlreadyExistExceptionTest</code> contains tests for the class <code>{@link AccountAlreadyExistException}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountAlreadyExistExceptionTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AccountAlreadyExistExceptionTest(String name) {
	}

	/**
	 * Run the AccountAlreadyExistException() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountAlreadyExistException_1()
		throws Exception {

		AccountAlreadyExistException result = new AccountAlreadyExistException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("poc.ctsbank.fido.web.error.AccountAlreadyExistException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the AccountAlreadyExistException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountAlreadyExistException_2()
		throws Exception {
		String message = "";

		AccountAlreadyExistException result = new AccountAlreadyExistException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("poc.ctsbank.fido.web.error.AccountAlreadyExistException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the AccountAlreadyExistException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountAlreadyExistException_3()
		throws Exception {
		Throwable cause = new Throwable();

		AccountAlreadyExistException result = new AccountAlreadyExistException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("poc.ctsbank.fido.web.error.AccountAlreadyExistException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the AccountAlreadyExistException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountAlreadyExistException_4()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		AccountAlreadyExistException result = new AccountAlreadyExistException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("poc.ctsbank.fido.web.error.AccountAlreadyExistException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccountAlreadyExistExceptionTest.class);
	}
}