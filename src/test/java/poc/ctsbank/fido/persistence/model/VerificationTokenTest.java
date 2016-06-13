package poc.ctsbank.fido.persistence.model;

import com.bm.datagen.Generator;
import com.bm.datagen.annotations.GeneratorType;
import com.bm.datagen.relation.*;
import com.bm.testsuite.BaseEntityFixture;

/**
 * The class <code>VerificationTokenTest</code> contains tests for the class <code>{@link VerificationToken}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class VerificationTokenTest extends BaseEntityFixture<VerificationToken> 
 {
	/**
	 * Generators to generate the entities specified in the mapping. 
	 *
	 */
	private static final Generator[] SPECIAL_GENERATORS = { 
			 new MyAccountOwnerCreator()
		 };
	
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public VerificationTokenTest() {
		super(VerificationToken.class, SPECIAL_GENERATORS);
	}

	/**
	 * Bean Generator Class
	 *
	 *
	 */
	@GeneratorType(className = AccountOwner.class)
	private static final class MyAccountOwnerCreator extends SingleBeanGenerator<AccountOwner>
	 {
		private MyAccountOwnerCreator() 
		 {
			super(AccountOwner.class);
		}
	}



	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(VerificationTokenTest.class);
	}
}