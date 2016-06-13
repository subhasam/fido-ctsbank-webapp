package poc.ctsbank.fido.spring;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.LinkedMultiValueMap;

/**
 * The class <code>SecondarySecurityConfigTest</code> contains tests for the class <code>{@link SecondarySecurityConfig}</code>.
 *
 *
 * @author Subhasis Samal
 * @version $Revision: 1.0 $
 */
public class SecondarySecurityConfigTest {
	/**
	 * Run the SecondarySecurityConfig() constructor test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testSecondarySecurityConfig_1()
		throws Exception {

		SecondarySecurityConfig result = new SecondarySecurityConfig();

		//TODO
		assertNotNull(result);
	}

	/**
	 * Run the DaoAuthenticationProvider authProvider() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testAuthProvider_1()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();

		DaoAuthenticationProvider result = fixture.authProvider();

		//TODO
		assertNotNull(result);
		assertEquals(false, result.isForcePrincipalAsString());
		assertEquals(true, result.isHideUserNotFoundExceptions());
	}

	/**
	 * Run the void configure(AuthenticationManagerBuilder) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_1()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		AuthenticationManagerBuilder auth = new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null);

		fixture.configure(auth);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_2()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_3()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_4()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_5()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_6()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(HttpSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_7()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		HttpSecurity http = new HttpSecurity((ObjectPostProcessor<Object>) null, new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null), new LinkedMultiValueMap());

		fixture.configure(http);

		//TODO
	}

	/**
	 * Run the void configure(WebSecurity) method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testConfigure_8()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();
		WebSecurity web = new WebSecurity((ObjectPostProcessor<Object>) null);

		fixture.configure(web);

		//TODO
	}

	/**
	 * Run the PasswordEncoder encoder() method test.
	 *
	 * @throws Exception
	 *
	 *
	 */
	@Test
	public void testEncoder_1()
		throws Exception {
		SecondarySecurityConfig fixture = new SecondarySecurityConfig();

		PasswordEncoder result = fixture.encoder();

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
		new org.junit.runner.JUnitCore().run(SecondarySecurityConfigTest.class);
	}
}