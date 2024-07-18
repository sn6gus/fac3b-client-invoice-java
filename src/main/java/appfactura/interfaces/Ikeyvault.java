package appfactura.interfaces;

import org.json.JSONObject;

public interface Ikeyvault {
	public JSONObject values(Integer type);
	public String value(String key);	
	public JSONObject stringtojson(String value);
}