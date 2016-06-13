package poc.ctsbank.fido.web.util;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.util.AutoPopulatingList;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * The class <code>GenericAccountRegistrationResTest</code> contains tests for the class <code>{@link GenericAccountRegistrationRes}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class GenericAccountRegistrationResTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public GenericAccountRegistrationResTest(String name) {
	}

	/**
	 * Run the GenericAccountRegistrationRes(String) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGenericAccountRegistrationRes_1()
		throws Exception {
		String message = "";

		GenericAccountRegistrationRes result = new GenericAccountRegistrationRes(message);

		//TODO
		assertNotNull(result);
		assertEquals("", result.getMessage());
		assertEquals(null, result.getError());
	}

	/**
	 * Run the GenericAccountRegistrationRes(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGenericAccountRegistrationRes_2()
		throws Exception {
		String message = "";
		String error = "";

		GenericAccountRegistrationRes result = new GenericAccountRegistrationRes(message, error);

		//TODO
		assertNotNull(result);
		assertEquals("", result.getMessage());
		assertEquals("", result.getError());
	}

	/**
	 * Run the GenericAccountRegistrationRes(List<FieldError>,List<ObjectError>) constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGenericAccountRegistrationRes_3()
		throws Exception {
		List<FieldError> fieldErrors = new AutoPopulatingList(Object.class);
		List<ObjectError> globalErrors = new AutoPopulatingList(Object.class);

		GenericAccountRegistrationRes result = new GenericAccountRegistrationRes(fieldErrors, globalErrors);

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the String getError() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetError_1()
		throws Exception {
		GenericAccountRegistrationRes fixture = new GenericAccountRegistrationRes("", "");

		String result = fixture.getError();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		GenericAccountRegistrationRes fixture = new GenericAccountRegistrationRes("", "");

		String result = fixture.getMessage();

		//TODO
		assertEquals("", result);
	}

	/**
	 * Run the void setError(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetError_1()
		throws Exception {
		GenericAccountRegistrationRes fixture = new GenericAccountRegistrationRes("", "");
		String error = "";

		fixture.setError(error);

		//TODO
	}

	/**
	 * Run the void setMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSetMessage_1()
		throws Exception {
		GenericAccountRegistrationRes fixture = new GenericAccountRegistrationRes("", "");
		String message = "";

		fixture.setMessage(message);

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
		new org.junit.runner.JUnitCore().run(GenericAccountRegistrationResTest.class);
	}
}