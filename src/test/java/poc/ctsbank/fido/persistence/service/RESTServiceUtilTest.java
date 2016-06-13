package poc.ctsbank.fido.persistence.service;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.web.client.RestTemplate;

/**
 * The class <code>RESTServiceUtilTest</code> contains tests for the class <code>{@link RESTServiceUtil}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class RESTServiceUtilTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public RESTServiceUtilTest(String name) {
	}

	/**
	 * Run the RestTemplate createRestTemplate() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testCreateRestTemplate_1()
		throws Exception {

		RestTemplate result = RESTServiceUtil.createRestTemplate();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(RESTServiceUtilTest.class);
	}
}