package poc.ctsbank.fido.persistence.delegate;

import org.junit.*;
import poc.ctsbank.fido.persistence.service.AccountService;
import poc.ctsbank.fido.persistence.service.AccountServiceImpl;
import static org.junit.Assert.*;

/**
 * The class <code>AccountRegistartionDelegateTest</code> contains tests for the class <code>{@link AccountRegistartionDelegate}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountRegistartionDelegateTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AccountRegistartionDelegateTest(String name) {
	}

	/**
	 * Run the AccountService getUserService() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetUserService_1()
		throws Exception {
		AccountRegistartionDelegate fixture = new AccountRegistartionDelegate();
		fixture.setUserService(new AccountServiceImpl());

		AccountService result = fixture.getUserService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValidUser_1()
		throws Exception {
		AccountRegistartionDelegate fixture = new AccountRegistartionDelegate();
		fixture.setUserService(new AccountServiceImpl());
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.isValidUser(AccountServiceImpl.java:54)
		//       at poc.ctsbank.fido.persistence.delegate.AccountRegistartionDelegate.isValidUser(AccountRegistartionDelegate.java:46)
		assertTrue(result);
	}

	/**
	 * Run the void setUserService(AccountService) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetUserService_1()
		throws Exception {
		AccountRegistartionDelegate fixture = new AccountRegistartionDelegate();
		fixture.setUserService(new AccountServiceImpl());
		AccountService accountService = new AccountServiceImpl();

		fixture.setUserService(accountService);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccountRegistartionDelegateTest.class);
	}
}