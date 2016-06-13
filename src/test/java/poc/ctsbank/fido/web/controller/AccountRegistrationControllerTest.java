package poc.ctsbank.fido.web.controller;

import java.util.Locale;
import poc.ctsbank.fido.persistence.service.AccountOwnerDTO;
import poc.ctsbank.fido.web.util.GenericAccountRegistrationRes;
import javax.servlet.http.HttpServletRequest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import junit.framework.*;

/**
 * The class <code>AccountRegistrationControllerTest</code> contains tests for the class <code>{@link AccountRegistrationController}</code>.
 *
 *, using the Spring generator
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountRegistrationControllerTest extends TestCase {
	/**
	 * Run the String confirmRegistration(Locale,Model,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	public void testConfirmRegistration_1()
		throws Exception {
		AccountRegistrationController fixture = new AccountRegistrationController();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();
		String token = (String) null;

		String result = fixture.confirmRegistration(locale, model, token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.controller.AccountRegistrationController.confirmRegistration(AccountRegistrationController.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the String confirmRegistration(Locale,Model,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	public void testConfirmRegistration_2()
		throws Exception {
		AccountRegistrationController fixture = new AccountRegistrationController();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();
		String token = (String) null;

		String result = fixture.confirmRegistration(locale, model, token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.controller.AccountRegistrationController.confirmRegistration(AccountRegistrationController.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the String confirmRegistration(Locale,Model,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	public void testConfirmRegistration_3()
		throws Exception {
		AccountRegistrationController fixture = new AccountRegistrationController();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();
		String token = (String) null;

		String result = fixture.confirmRegistration(locale, model, token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.controller.AccountRegistrationController.confirmRegistration(AccountRegistrationController.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the String confirmRegistration(Locale,Model,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	public void testConfirmRegistration_4()
		throws Exception {
		AccountRegistrationController fixture = new AccountRegistrationController();
		Locale locale = Locale.getDefault();
		ExtendedModelMap model = new ExtendedModelMap();
		String token = (String) null;

		String result = fixture.confirmRegistration(locale, model, token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.controller.AccountRegistrationController.confirmRegistration(AccountRegistrationController.java:81)
		assertNotNull(result);
	}

	/**
	 * Run the GenericAccountRegistrationRes registerUserAccount(AccountOwnerDTO,HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	public void testRegisterUserAccount_1()
		throws Exception {
		AccountRegistrationController fixture = new AccountRegistrationController();
		AccountOwnerDTO accountDto = new AccountOwnerDTO();
		MockHttpServletRequest request = new MockHttpServletRequest();

		GenericAccountRegistrationRes result = fixture.registerUserAccount(accountDto, request);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.controller.AccountRegistrationController.registerUserAccount(AccountRegistrationController.java:67)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 *
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 *
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
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
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(AccountRegistrationControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new AccountRegistrationControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}