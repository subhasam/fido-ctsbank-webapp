package poc.ctsbank.fido.registration.listener;

import org.junit.*;
import poc.ctsbank.fido.registration.AccountRegistrationEvent;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import static org.junit.Assert.*;

/**
 * The class <code>AccountAuthStatusListenerTest</code> contains tests for the class <code>{@link AccountAuthStatusListener}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountAuthStatusListenerTest {
	/**
	 * Run the Object monitorStatusChange(String,AccountRegistrationEvent) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testMonitorStatusChange_1()
		throws Exception {
		AccountAuthStatusListener fixture = new AccountAuthStatusListener();
		String accAuthInitialStat = "";
		AccountRegistrationEvent event = new AccountRegistrationEvent(new AccountOwner());

		Object result = fixture.monitorStatusChange(accAuthInitialStat, event);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void onApplicationEvent(AccountRegistrationEvent) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testOnApplicationEvent_1()
		throws Exception {
		AccountAuthStatusListener fixture = new AccountAuthStatusListener();
		AccountRegistrationEvent event = new AccountRegistrationEvent(new AccountOwner());

		fixture.onApplicationEvent(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.registration.listener.AccountAuthStatusListener.confirmRegistration(AccountAuthStatusListener.java:56)
		//       at poc.ctsbank.fido.registration.listener.AccountAuthStatusListener.onApplicationEvent(AccountAuthStatusListener.java:35)
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
		new org.junit.runner.JUnitCore().run(AccountAuthStatusListenerTest.class);
	}
}