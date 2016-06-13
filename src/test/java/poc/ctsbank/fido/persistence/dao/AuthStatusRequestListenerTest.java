package poc.ctsbank.fido.persistence.dao;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthStatusRequestListenerTest</code> contains tests for the class <code>{@link AuthStatusRequestListener}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AuthStatusRequestListenerTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AuthStatusRequestListenerTest(String name) {
	}

	/**
	 * Run the AuthStatusRequestListener() constructor test.
	 *
	 *
	 */
	@Test
	public void testAuthStatusRequestListener_1()
		throws Exception {
		AuthStatusRequestListener result = new AuthStatusRequestListener();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getAccAuthStatus() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetAccAuthStatus_1()
		throws Exception {
		AuthStatusRequestListener fixture = new AuthStatusRequestListener();
		fixture.setAuthStatChanged(true);
		fixture.setAccAuthStatus("");

		String result = fixture.getAccAuthStatus();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isAuthStatChanged() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsAuthStatChanged_1()
		throws Exception {
		AuthStatusRequestListener fixture = new AuthStatusRequestListener();
		fixture.setAuthStatChanged(true);
		fixture.setAccAuthStatus("");

		boolean result = fixture.isAuthStatChanged();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the String monitorAuthSatus(String,AccountServiceDAO) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testMonitorAuthSatus_1()
		throws Exception {
		AuthStatusRequestListener fixture = new AuthStatusRequestListener();
		fixture.setAuthStatChanged(true);
		fixture.setAccAuthStatus("");
		String initialStatus = "";
		AccountServiceDAO accountSrvcDAO = new AccountServiceDAOImpl();

		String result = fixture.monitorAuthSatus(initialStatus, accountSrvcDAO);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.dao.AuthStatusRequestListener.shutdownArtifactExecuterSrvc(AuthStatusRequestListener.java:267)
		//       at poc.ctsbank.fido.persistence.dao.AuthStatusRequestListener.monitorAuthSatus(AuthStatusRequestListener.java:134)
		assertNotNull(result);
	}

	/**
	 * Run the void setAccAuthStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetAccAuthStatus_1()
		throws Exception {
		AuthStatusRequestListener fixture = new AuthStatusRequestListener();
		fixture.setAuthStatChanged(true);
		fixture.setAccAuthStatus("");
		String accAuthStatus = "";

		fixture.setAccAuthStatus(accAuthStatus);

		// add additional test code here
	}

	/**
	 * Run the void setAuthStatChanged(boolean) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetAuthStatChanged_1()
		throws Exception {
		AuthStatusRequestListener fixture = new AuthStatusRequestListener();
		fixture.setAuthStatChanged(true);
		fixture.setAccAuthStatus("");
		boolean authStatChanged = true;

		fixture.setAuthStatChanged(authStatChanged);

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
		new org.junit.runner.JUnitCore().run(AuthStatusRequestListenerTest.class);
	}
}