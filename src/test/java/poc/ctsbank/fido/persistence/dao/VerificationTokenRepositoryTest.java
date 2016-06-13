package poc.ctsbank.fido.persistence.dao;

import org.junit.*;
import poc.ctsbank.fido.persistence.model.VerificationToken;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import static org.junit.Assert.*;

/**
 * The class <code>VerificationTokenRepositoryTest</code> contains tests for the class <code>{@link VerificationTokenRepository}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class VerificationTokenRepositoryTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public VerificationTokenRepositoryTest(String name) {
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VerificationTokenRepositoryTest.class);
	}
}