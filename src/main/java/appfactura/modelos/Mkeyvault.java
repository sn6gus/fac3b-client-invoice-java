package appfactura.modelos;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

import appfactura.interfaces.Ikeyvault;

@Service
public class Mkeyvault implements Ikeyvault{
	private static final Logger logger = LoggerFactory.getLogger(Mkeyvault.class);	
	@Autowired
	Environment env;
	
	@Override
	public JSONObject values(Integer type) {		
	    try {
	    	switch (type) {
				case 1: 
					return stringtojson(value(env.getProperty("spring.key.pacdigifact")));			
				default:
					return null;
			}	    		        
	    } catch (JSONException e) {	    	
	    	logger.error("valores- "+e.getMessage());
	    }
	    return null;
	}
	
	@Override
	public String value(String key) {
		try {
			ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
	                  .clientId("b13184cf-4ae1-413d-b5cb-c7aedde4da2b")
	                  .clientSecret(".ze8Q~DJ2bcFF58QqAJcoke~hvtxd3lJ~RRZ4bWq")
	                  .tenantId("94de3208-b3fe-4ef4-8a57-b11a568a89a9")
	                  .build();
			 SecretClient secretClient = new SecretClientBuilder()
	                  .vaultUrl("https://concftpprod.vault.azure.ne/")
	                  .credential(clientSecretCredential)
	                  .buildClient();
			  KeyVaultSecret secret = secretClient.getSecret(key);
			  
			  return (secret.getValue()== null)?"{\"valores\":\"error\"}":secret.getValue();
		} catch (Exception e) {
			logger.error("value- "+e.getMessage());
			return "{\"valores\":\""+e.getMessage()+"\"}";
		}
	}
	
	@Override
	public JSONObject stringtojson(String value) {
	    try {
	    	if(value != null) {
	    		if(!value.equals("")) {
	    			return new JSONObject(value);
	    		}
	    	}	        
	    } catch (JSONException e) {
	    	logger.error("value- "+e.getMessage());
	    }
	    return null;
	}
}
