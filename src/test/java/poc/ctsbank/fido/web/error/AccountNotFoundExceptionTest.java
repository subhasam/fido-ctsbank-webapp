package poc.ctsbank.fido.web.error;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AccountNotFoundExceptionTest</code> contains tests for the class <code>{@link AccountNotFoundException}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountNotFoundExceptionTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AccountNotFoundExceptionTest(String name) {
	}

	/**
	 * Run the AccountNotFoundException() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountNotFoundException_1()
		throws Exception {

		AccountNotFoundException result = new AccountNotFoundException();

		//TODO
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("poc.ctsbank.fido.web.error.AccountNotFoundException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the AccountNotFoundException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountNotFoundException_2()
		throws Exception {
		String message = "";

		AccountNotFoundException result = new AccountNotFoundException(message);

		//TODO
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("poc.ctsbank.fido.web.error.AccountNotFoundException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the AccountNotFoundException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountNotFoundException_3()
		throws Exception {
		Throwable cause = new Throwable();

		AccountNotFoundException result = new AccountNotFoundException(cause);

		//TODO
		assertNotNull(result);
		assertEquals("poc.ctsbank.fido.web.error.AccountNotFoundException: java.lang.Throwable", result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the AccountNotFoundException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountNotFoundException_4()
		throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		AccountNotFoundException result = new AccountNotFoundException(message, cause);

		//TODO
		assertNotNull(result);
		assertEquals("poc.ctsbank.fido.web.error.AccountNotFoundException: ", result.toString());
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
		new org.junit.runner.JUnitCore().run(AccountNotFoundExceptionTest.class);
	}
}