package com.moengage.utill;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;



public class TestDataFileHandler{
	private Map<String, String> configPropertiesMap;
	
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public void loadConfigProperties() {
		    Properties properties = new Properties();
		    InputStream inputStream = null;
		    try {
		      String configFile = Constant.CONFIGURATION_PROPERTIES;
		      inputStream = TestDataFileHandler.class.getClassLoader().getResourceAsStream(configFile);
		      // Loading the property file
		      properties.load(inputStream);
		    } catch (FileNotFoundException e) {
		      Log.error("Property file was not found");
		    } catch (IOException e) {
		      Log.error("The key was not found in the property file");
		    } finally {
		      if (inputStream != null) {
		        try {
		          inputStream.close();
		        } catch (IOException e) {
		          Log.error("The property file was not closed");
		        }
		      }
		    }
		    // Getting the corresponding value of the key in the property file
		    configPropertiesMap = new HashMap<String, String>((Map) properties);
	}
	 
	 public String getPropertyValue(String key) {
		    String value = configPropertiesMap.get(key);
		    CustomAssert.assertTrue(value != null, "Properties not found corresponding to " + key);
		return StringUtils.trimToEmpty(value);
	}
}
