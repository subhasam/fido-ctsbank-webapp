package poc.ctsbank.fido.persistence.service;

import org.junit.*;
import poc.ctsbank.fido.persistence.model.VerificationToken;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import static org.junit.Assert.*;

/**
 * The class <code>AccountServiceImplTest</code> contains tests for the class <code>{@link AccountServiceImpl}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountServiceImplTest {
	/**
	 * Run the void changeAccountOwnerPassword(AccountOwner,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testChangeAccountOwnerPassword_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();
		String password = "";

		fixture.changeAccountOwnerPassword(user, password);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.changeAccountOwnerPassword(AccountServiceImpl.java:177)
	}

	/**
	 * Run the boolean checkIfValidOldPassword(AccountOwner,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testCheckIfValidOldPassword_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();
		user.setPassword("");
		String oldPassword = "";

		boolean result = fixture.checkIfValidOldPassword(user, oldPassword);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.checkIfValidOldPassword(AccountServiceImpl.java:190)
		assertTrue(result);
	}

	/**
	 * Run the boolean checkIfValidOldPassword(AccountOwner,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testCheckIfValidOldPassword_2()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();
		user.setPassword("");
		String oldPassword = "";

		boolean result = fixture.checkIfValidOldPassword(user, oldPassword);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.checkIfValidOldPassword(AccountServiceImpl.java:190)
		assertTrue(result);
	}

	/**
	 * Run the void createPasswordResetTokenForUser(AccountOwner,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testCreatePasswordResetTokenForUser_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();
		String token = "";

		fixture.createPasswordResetTokenForUser(user, token);

		//TODO
	}

	/**
	 * Run the void createVerificationTokenForUser(AccountOwner,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testCreateVerificationTokenForUser_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();
		String token = "";

		fixture.createVerificationTokenForUser(user, token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.createVerificationTokenForUser(AccountServiceImpl.java:130)
	}

	/**
	 * Run the void deleteAccount(AccountOwner) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDeleteAccount_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();

		fixture.deleteAccount(user);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.deleteAccount(AccountServiceImpl.java:118)
	}

	/**
	 * Run the AccountOwner findAccountOwnerByEmail(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testFindAccountOwnerByEmail_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String email = "";

		AccountOwner result = fixture.findAccountOwnerByEmail(email);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.findAccountOwnerByEmail(AccountServiceImpl.java:155)
		assertNotNull(result);
	}

	/**
	 * Run the VerificationToken generateNewVerificationToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGenerateNewVerificationToken_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String existingVerificationToken = "";

		VerificationToken result = fixture.generateNewVerificationToken(existingVerificationToken);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.generateNewVerificationToken(AccountServiceImpl.java:141)
		assertNotNull(result);
	}

	/**
	 * Run the AccountOwner getAccountOwnerByID(long) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetAccountOwnerByID_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		long id = 1L;

		AccountOwner result = fixture.getAccountOwnerByID(id);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.getAccountOwnerByID(AccountServiceImpl.java:166)
		assertNotNull(result);
	}

	/**
	 * Run the AccountOwner getAccountOwnerByPasswordResetToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testGetAccountOwnerByPasswordResetToken_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String token = "";

		AccountOwner result = fixture.getAccountOwnerByPasswordResetToken(token);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the AccountOwner getAccountOwnerDetails(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetAccountOwnerDetails_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String verificationToken = "";

		AccountOwner result = fixture.getAccountOwnerDetails(verificationToken);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.getAccountOwnerDetails(AccountServiceImpl.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the VerificationToken getVerificationToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetVerificationToken_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String VerificationToken = "";

		VerificationToken result = fixture.getVerificationToken(VerificationToken);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.getVerificationToken(AccountServiceImpl.java:98)
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
		AccountServiceImpl fixture = new AccountServiceImpl();
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.isValidUser(AccountServiceImpl.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValidUser_2()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.isValidUser(AccountServiceImpl.java:54)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testIsValidUser_3()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.isValidUser(AccountServiceImpl.java:54)
		assertTrue(result);
	}

	/**
	 * Run the AccountOwner registerAccount(AccountOwnerDTO) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testRegisterAccount_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwnerDTO accountDTO = new AccountOwnerDTO();
		accountDTO.setEmail("");

		AccountOwner result = fixture.registerAccount(accountDTO);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.emailExist(AccountServiceImpl.java:223)
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.registerAccount(AccountServiceImpl.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the AccountOwner registerAccount(AccountOwnerDTO) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testRegisterAccount_2()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwnerDTO accountDTO = new AccountOwnerDTO();
		accountDTO.setEmail("");
		accountDTO.setLastName("");
		accountDTO.setFirstName("");
		accountDTO.setPassword("");

		AccountOwner result = fixture.registerAccount(accountDTO);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.emailExist(AccountServiceImpl.java:223)
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.registerAccount(AccountServiceImpl.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the void saveRegisteredAccountOwner(AccountOwner) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSaveRegisteredAccountOwner_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		AccountOwner user = new AccountOwner();

		fixture.saveRegisteredAccountOwner(user);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.saveRegisteredAccountOwner(AccountServiceImpl.java:108)
	}

	/**
	 * Run the String validatePasswordResetToken(long,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testValidatePasswordResetToken_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		long id = 1L;
		String token = "";

		String result = fixture.validatePasswordResetToken(id, token);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String validateVerificationToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testValidateVerificationToken_1()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String token = "";

		String result = fixture.validateVerificationToken(token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.validateVerificationToken(AccountServiceImpl.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the String validateVerificationToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testValidateVerificationToken_2()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String token = "";

		String result = fixture.validateVerificationToken(token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.validateVerificationToken(AccountServiceImpl.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the String validateVerificationToken(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testValidateVerificationToken_3()
		throws Exception {
		AccountServiceImpl fixture = new AccountServiceImpl();
		String token = "";

		String result = fixture.validateVerificationToken(token);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.persistence.service.AccountServiceImpl.validateVerificationToken(AccountServiceImpl.java:201)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AccountServiceImplTest.class);
	}
}