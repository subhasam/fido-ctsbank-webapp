package poc.ctsbank.fido.registration;

import org.junit.*;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import static org.junit.Assert.*;

/**
 * The class <code>AccountRegistrationEventTest</code> contains tests for the class <code>{@link AccountRegistrationEvent}</code>.
 *
 * @generatedBy CodePro at 6/12/16 7:56 PM
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountRegistrationEventTest {
	/**
	 * Run the AccountRegistrationEvent(AccountOwner) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testAccountRegistrationEvent_1()
		throws Exception {
		AccountOwner accountOwner = new AccountOwner();

		AccountRegistrationEvent result = new AccountRegistrationEvent(accountOwner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1465786607520L, result.getTimestamp());
		assertEquals("poc.ctsbank.fido.registration.AccountRegistrationEvent[source=AccountOwner [id=null, firstName=null, lastName=null, email=null, accountNumber=null, enabled=false, tokenExpired=false, roles=null]]", result.toString());
	}

	/**
	 * Run the AccountOwner getAccountOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/12/16 7:56 PM
	 */
	@Test
	public void testGetAccountOwner_1()
		throws Exception {
		AccountRegistrationEvent fixture = new AccountRegistrationEvent(new AccountOwner());

		AccountOwner result = fixture.getAccountOwner();

		// add additional test code here
		assertNotNull(result);
		assertEquals("AccountOwner [id=null, firstName=null, lastName=null, email=null, accountNumber=null, enabled=false, tokenExpired=false, roles=null]", result.toString());
		assertEquals(null, result.getId());
		assertEquals(false, result.isEnabled());
		assertEquals(null, result.getPassword());
		assertEquals(null, result.getEmail());
		assertEquals(null, result.getAccountNumber());
		assertEquals(false, result.isTokenExpired());
		assertEquals(null, result.getRoutingNumber());
		assertEquals(null, result.getFirstName());
		assertEquals(null, result.getLastName());
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
		new org.junit.runner.JUnitCore().run(AccountRegistrationEventTest.class);
	}
}