package poc.ctsbank.fido.persistence.dao;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.*;
import static org.junit.Assert.*;
import com.bm.cfg.Ejb3UnitCfg;
import com.bm.utils.BasicDataSource;

/**
 * The class <code>AccountServiceDAOImplTest</code> contains tests for the class <code>{@link AccountServiceDAOImpl}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountServiceDAOImplTest {
	/**
	 * Run the DataSource getAccOwnerDataSource() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetAccOwnerDataSource_1()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));

		DataSource result = fixture.getAccOwnerDataSource();

		//TODO
		assertNotNull(result);
		assertEquals(null, result.getLogWriter());
		assertEquals(0, result.getLoginTimeout());
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_1()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_2()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_3()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_4()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_5()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_6()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_7()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdatedStatusInDB(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetUpdatedStatusInDB_8()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String fieldName = "";

		String result = fixture.getUpdatedStatusInDB(fieldName);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_1()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_2()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_3()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_4()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_5()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_6()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_7()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_8()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_9()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidUser(String,String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testIsValidUser_10()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		String username = "";
		String password = "";

		boolean result = fixture.isValidUser(username, password);

		//TODO
		assertTrue(result);
	}

	/**
	 * Run the void setAccOwnerDataSource(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetAccOwnerDataSource_1()
		throws Exception {
		AccountServiceDAOImpl fixture = new AccountServiceDAOImpl();
		fixture.setAccOwnerDataSource(new BasicDataSource(Ejb3UnitCfg.getConfiguration()));
		DataSource accOwnerDataSource = new BasicDataSource(Ejb3UnitCfg.getConfiguration());

		fixture.setAccOwnerDataSource(accOwnerDataSource);

		//TODO
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
		new org.junit.runner.JUnitCore().run(AccountServiceDAOImplTest.class);
	}
}