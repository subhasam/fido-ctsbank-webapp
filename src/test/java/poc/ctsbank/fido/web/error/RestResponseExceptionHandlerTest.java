package poc.ctsbank.fido.web.error;

import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.NoSupportAsyncWebRequest;

/**
 * The class <code>RestResponseExceptionHandlerTest</code> contains tests for the class <code>{@link RestResponseExceptionHandler}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class RestResponseExceptionHandlerTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 *
	 */
	public RestResponseExceptionHandlerTest(String name) {
	}

	/**
	 * Run the RestResponseExceptionHandler() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testRestResponseExceptionHandler_1()
		throws Exception {

		RestResponseExceptionHandler result = new RestResponseExceptionHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResponseEntity<Object> handleBindException(BindException,HttpHeaders,HttpStatus,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleBindException_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		BindException ex = new BindException(new BeanPropertyBindingResult(new Object(), ""));
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.ACCEPTED;
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleBindException(ex, headers, status, request);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<400 Bad Request,poc.ctsbank.fido.web.util.GenericAccountRegistrationRes@392cfcfe,{}>", result.toString());
		assertEquals(true, result.hasBody());
	}

	/**
	 * Run the ResponseEntity<Object> handleInternal(RuntimeException,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleInternal_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		RuntimeException ex = new RuntimeException();
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleInternal(ex, request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.error.RestResponseExceptionHandler.handleInternal(RestResponseExceptionHandler.java:118)
		assertNotNull(result);
	}

	/**
	 * Run the ResponseEntity<Object> handleInvalidOldPassword(RuntimeException,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleInvalidOldPassword_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		RuntimeException ex = new RuntimeException();
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleInvalidOldPassword(ex, request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.error.RestResponseExceptionHandler.handleInvalidOldPassword(RestResponseExceptionHandler.java:76)
		assertNotNull(result);
	}

	/**
	 * Run the ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException,HttpHeaders,HttpStatus,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleMethodArgumentNotValid_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		MethodArgumentNotValidException ex = new MethodArgumentNotValidException(new MethodParameter(Object.class.getMethods()[0], 1), new BeanPropertyBindingResult(new Object(), ""));
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.ACCEPTED;
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleMethodArgumentNotValid(ex, headers, status, request);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<400 Bad Request,poc.ctsbank.fido.web.util.GenericAccountRegistrationRes@6a410952,{}>", result.toString());
		assertEquals(true, result.hasBody());
	}

	/**
	 * Run the ResponseEntity<Object> handleUserAlreadyExist(RuntimeException,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleUserAlreadyExist_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		RuntimeException ex = new RuntimeException();
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleUserAlreadyExist(ex, request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.error.RestResponseExceptionHandler.handleUserAlreadyExist(RestResponseExceptionHandler.java:104)
		assertNotNull(result);
	}

	/**
	 * Run the ResponseEntity<Object> handleUserNotFound(RuntimeException,WebRequest) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testHandleUserNotFound_1()
		throws Exception {
		RestResponseExceptionHandler fixture = new RestResponseExceptionHandler();
		RuntimeException ex = new RuntimeException();
		WebRequest request = new NoSupportAsyncWebRequest(new MockHttpServletRequest(), new MockHttpServletResponse());

		ResponseEntity<Object> result = fixture.handleUserNotFound(ex, request);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at poc.ctsbank.fido.web.error.RestResponseExceptionHandler.handleUserNotFound(RestResponseExceptionHandler.java:90)
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
		new org.junit.runner.JUnitCore().run(RestResponseExceptionHandlerTest.class);
	}
}