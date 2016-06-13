package poc.ctsbank.fido.persistence.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class FIDOAuthernticationService {
	
	@Autowired
	private Environment samsungFidoEnv;
	
	private RestTemplate fidoServiceRestTemplate;
	public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	/**
	 * Method getUserAccountDualAuthStatus.
	 * @param fidoSrvcInputParams String[]
	 * @return String
	 */
	public String getUserAccountDualAuthStatus(String... fidoSrvcInputParams) {
		Map<String, Object> requestBody = new HashMap<String, Object>();
		String fidoAuthResponse = null;
		requestBody.put("requestBody", fidoSrvcInputParams[0]);
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set("Content-Type", "application/fido+uaf; charset=utf-8");
		requestHeaders.set("Accept", "application/fido+uaf");
		requestHeaders.set("User-Agent", "O2RPC/1.0");
		try {
			HttpEntity<String> httpEntity = new HttpEntity<String>(OBJECT_MAPPER.writeValueAsString(requestBody),
					requestHeaders);
			fidoServiceRestTemplate = RESTServiceUtil.createRestTemplate();
			fidoAuthResponse = fidoServiceRestTemplate.postForObject(
					"http://fido3.sdsagov.com:8080/fido-poc/rp1/uaf/requestAuthentication", httpEntity, String.class,
					Collections.<String, Object> emptyMap());
			System.out.println("Output = " + fidoAuthResponse);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
