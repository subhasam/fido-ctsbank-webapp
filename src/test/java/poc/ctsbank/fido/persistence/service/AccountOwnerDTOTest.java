package poc.ctsbank.fido.persistence.service;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AccountOwnerDTOTest</code> contains tests for the class <code>{@link AccountOwnerDTO}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountOwnerDTOTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AccountOwnerDTOTest(String name) {
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		//TODO
		assertEquals(false, result);
	}

	/**
	 * Run the String getAccountNumber() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetAccountNumber_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getAccountNumber();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getEmail() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetEmail_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getEmail();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getFirstName() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetFirstName_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getFirstName();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getLastName() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetLastName_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getLastName();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getMatchingPassword() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetMatchingPassword_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getMatchingPassword();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getPassword();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getRoutingNumber() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetRoutingNumber_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		String result = fixture.getRoutingNumber();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName((String) null);
		fixture.setEmail((String) null);
		fixture.setLastName("");
		fixture.setAccountNumber((String) null);
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");

		int result = fixture.hashCode();

		//TODO
		assertEquals(1742810335, result);
	}

	/**
	 * Run the void setAccountNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetAccountNumber_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String accountNumber = "";

		fixture.setAccountNumber(accountNumber);

		//TODO
	}

	/**
	 * Run the void setEmail(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetEmail_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String email = "";

		fixture.setEmail(email);

		//TODO
	}

	/**
	 * Run the void setFirstName(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetFirstName_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String firstName = "";

		fixture.setFirstName(firstName);

		//TODO
	}

	/**
	 * Run the void setLastName(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetLastName_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String lastName = "";

		fixture.setLastName(lastName);

		//TODO
	}

	/**
	 * Run the void setMatchingPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetMatchingPassword_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String matchingPassword = "";

		fixture.setMatchingPassword(matchingPassword);

		//TODO
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String password = "";

		fixture.setPassword(password);

		//TODO
	}

	/**
	 * Run the void setRoutingNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetRoutingNumber_1()
		throws Exception {
		AccountOwnerDTO fixture = new AccountOwnerDTO();
		fixture.setPassword("");
		fixture.setFirstName("");
		fixture.setEmail("");
		fixture.setLastName("");
		fixture.setAccountNumber("");
		fixture.setMatchingPassword("");
		fixture.setRoutingNumber("");
		String routingNumber = "";

		fixture.setRoutingNumber(routingNumber);

		//TODO
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccountOwnerDTOTest.class);
	}
}