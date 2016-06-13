package poc.ctsbank.fido.spring;

import javax.servlet.ServletContext;
import org.junit.*;
import poc.ctsbank.fido.validation.PasswordMatchesValidator;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import poc.ctsbank.fido.validation.EmailValidator;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 * The class <code>AccountRegisterConfigTest</code> contains tests for the class <code>{@link AccountRegisterConfig}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class AccountRegisterConfigTest {
	/**
	 * Run the AccountRegisterConfig() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAccountRegisterConfig_1()
		throws Exception {

		AccountRegisterConfig result = new AccountRegisterConfig();

		//TODO
		assertNotNull(result);
		assertEquals(null, result.getValidator());
		assertEquals(null, result.getMessageCodesResolver());
	}

	/**
	 * Run the void addInterceptors(InterceptorRegistry) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAddInterceptors_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();
		InterceptorRegistry registry = new InterceptorRegistry();

		fixture.addInterceptors(registry);

		//TODO
	}

	/**
	 * Run the void addResourceHandlers(ResourceHandlerRegistry) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAddResourceHandlers_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();
		ResourceHandlerRegistry registry = new ResourceHandlerRegistry(new AnnotationConfigWebApplicationContext(), new MockServletContext());

		fixture.addResourceHandlers(registry);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Cannot resolve ServletContextResource without ServletContext
		//       at org.springframework.util.Assert.notNull(Assert.java:115)
		//       at org.springframework.web.context.support.ServletContextResource.<init>(ServletContextResource.java:68)
		//       at org.springframework.web.context.support.AbstractRefreshableWebApplicationContext.getResourceByPath(AbstractRefreshableWebApplicationContext.java:174)
		//       at org.springframework.core.io.DefaultResourceLoader.getResource(DefaultResourceLoader.java:92)
		//       at org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration.addResourceLocations(ResourceHandlerRegistration.java:76)
		//       at poc.ctsbank.fido.spring.AccountRegisterConfig.addResourceHandlers(AccountRegisterConfig.java:76)
	}

	/**
	 * Run the void addViewControllers(ViewControllerRegistry) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAddViewControllers_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();
		ViewControllerRegistry registry = new ViewControllerRegistry();

		fixture.addViewControllers(registry);

		//TODO
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.ApplicationContextException: Invalid application context: needs to be of type [org.springframework.context.ApplicationContext]
		//       at org.springframework.context.support.ApplicationObjectSupport.setApplicationContext(ApplicationObjectSupport.java:70)
		//       at org.springframework.web.servlet.config.annotation.ViewControllerRegistration.setApplicationContext(ViewControllerRegistration.java:70)
		//       at org.springframework.web.servlet.config.annotation.ViewControllerRegistry.addViewController(ViewControllerRegistry.java:55)
		//       at poc.ctsbank.fido.spring.AccountRegisterConfig.addViewControllers(AccountRegisterConfig.java:45)
	}

	/**
	 * Run the void configureDefaultServletHandling(DefaultServletHandlerConfigurer) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testConfigureDefaultServletHandling_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();
		DefaultServletHandlerConfigurer configurer = new DefaultServletHandlerConfigurer(new MockServletContext());

		fixture.configureDefaultServletHandling(configurer);

		//TODO
	}

	/**
	 * Run the LocaleResolver localeResolver() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testLocaleResolver_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();

		LocaleResolver result = fixture.localeResolver();

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the PasswordMatchesValidator passwordMatchesValidator() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testPasswordMatchesValidator_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();

		PasswordMatchesValidator result = fixture.passwordMatchesValidator();

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the EmailValidator usernameValidator() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testUsernameValidator_1()
		throws Exception {
		AccountRegisterConfig fixture = new AccountRegisterConfig();

		EmailValidator result = fixture.usernameValidator();

		//TODO
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
		new org.junit.runner.JUnitCore().run(AccountRegisterConfigTest.class);
	}
}