package poc.ctsbank.fido.spring;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import poc.ctsbank.fido.validation.EmailValidator;
import poc.ctsbank.fido.validation.PasswordMatchesValidator;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Configuration
@ComponentScan(basePackages = { "poc.ctsbank.fido.web" })
@EnableWebMvc
public class AccountRegisterConfig extends WebMvcConfigurerAdapter {

    public AccountRegisterConfig() {
        super();
    }

    //

    /**
     * Method addViewControllers.
     * @param registry ViewControllerRegistry
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addViewControllers(ViewControllerRegistry)
     */
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("forward:/login");
        registry.addViewController("/login");
        registry.addViewController("/accountRegistration.html");
        registry.addViewController("/logout.html");
        registry.addViewController("/homepage.html");
        registry.addViewController("/emailError.html");
        registry.addViewController("/home.html");
        registry.addViewController("/invalidSession.html");
        registry.addViewController("/accRegiterSuccess.html");
        registry.addViewController("/forgetPassword.html");
        registry.addViewController("/updatePassword.html");
        registry.addViewController("/changePassword.html");
    }

    /**
     * Method configureDefaultServletHandling.
     * @param configurer DefaultServletHandlerConfigurer
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#configureDefaultServletHandling(DefaultServletHandlerConfigurer)
     */
    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * Method addResourceHandlers.
     * @param registry ResourceHandlerRegistry
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addResourceHandlers(ResourceHandlerRegistry)
     */
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/", "/resources/");
    }

    /**
     * Method addInterceptors.
     * @param registry InterceptorRegistry
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addInterceptors(InterceptorRegistry)
     */
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        final LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        registry.addInterceptor(localeChangeInterceptor);
    }

    // beans

    /**
     * Method localeResolver.
     * @return LocaleResolver
     */
    @Bean
    public LocaleResolver localeResolver() {
        final CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return cookieLocaleResolver;
    }

    /**
     * Method usernameValidator.
     * @return EmailValidator
     */
    @Bean
    public EmailValidator usernameValidator() {
        return new EmailValidator();
    }

    /**
     * Method passwordMatchesValidator.
     * @return PasswordMatchesValidator
     */
    @Bean
    public PasswordMatchesValidator passwordMatchesValidator() {
        return new PasswordMatchesValidator();
    }

}