package poc.ctsbank.fido.persistence.service;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FIDOAuthernticationServiceTest</code> contains tests for the class <code>{@link FIDOAuthernticationService}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class FIDOAuthernticationServiceTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public FIDOAuthernticationServiceTest(String name) {
	}

	/**
	 * Run the FIDOAuthernticationService() constructor test.
	 *
	 *
	 */
	@Test
	public void testFIDOAuthernticationService_1()
		throws Exception {
		FIDOAuthernticationService result = new FIDOAuthernticationService();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getUserAccountDualAuthStatus(String[]) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetUserAccountDualAuthStatus_1()
		throws Exception {
		FIDOAuthernticationService fixture = new FIDOAuthernticationService();

		String result = fixture.getUserAccountDualAuthStatus();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at poc.ctsbank.fido.persistence.service.FIDOAuthernticationService.getUserAccountDualAuthStatus(FIDOAuthernticationService.java:37)
		assertNotNull(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FIDOAuthernticationServiceTest.class);
	}
}