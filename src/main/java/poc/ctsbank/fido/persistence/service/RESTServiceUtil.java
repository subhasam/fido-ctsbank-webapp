/**
 * 
 */
package poc.ctsbank.fido.persistence.service;

import org.springframework.web.client.RestTemplate;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public enum RESTServiceUtil {
	INSTANCE;
	
	/**
	 * Method createRestTemplate.
	 * @return RestTemplate
	 */
	public static final RestTemplate createRestTemplate() {
		RestTemplate fidoRestService = new RestTemplate();
		return fidoRestService;
	}

}
