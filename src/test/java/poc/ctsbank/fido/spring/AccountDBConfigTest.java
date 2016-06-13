package poc.ctsbank.fido.spring;

import javax.sql.DataSource;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

/**
 * The class <code>AccountDBConfigTest</code> contains tests for the class <code>{@link AccountDBConfig}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountDBConfigTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public AccountDBConfigTest(String name) {
	}

	/**
	 * Run the AccountDBConfig() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountDBConfig_1()
		throws Exception {

		AccountDBConfig result = new AccountDBConfig();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DataSource dataSource() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testDataSource_1()
		throws Exception {
		AccountDBConfig fixture = new AccountDBConfig();

		DataSource result = fixture.dataSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.spring.AccountDBConfig.dataSource(AccountDBConfig.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the PersistenceExceptionTranslationPostProcessor exceptionTranslation() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testExceptionTranslation_1()
		throws Exception {
		AccountDBConfig fixture = new AccountDBConfig();

		PersistenceExceptionTranslationPostProcessor result = fixture.exceptionTranslation();

		// add additional test code here
		assertNotNull(result);
		assertEquals(Integer.MAX_VALUE, result.getOrder());
		assertEquals("proxyTargetClass=false; optimize=false; opaque=false; exposeProxy=false; frozen=false", result.toString());
		assertEquals(false, result.isFrozen());
		assertEquals(false, result.isOpaque());
		assertEquals(false, result.isProxyTargetClass());
		assertEquals(false, result.isExposeProxy());
		assertEquals(false, result.isOptimize());
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccountDBConfigTest.class);
	}
}