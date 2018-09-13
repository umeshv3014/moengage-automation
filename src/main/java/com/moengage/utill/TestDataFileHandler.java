package com.moengage.utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class TestDataFileHandler {
	public Map<String, String> configPropertiesMap;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void loadConfigProperties() {
		FileInputStream fileInput = null;
		Properties properties = new Properties();
		String configFile = Constant.CONFIGURATION_PROPERTIES;
		File file = new File(configFile);
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			properties.load(fileInput);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Getting the corresponding value of the key in the property file
		configPropertiesMap = new HashMap<String, String>((Map) properties);
	}

	public String getPropertyValue(String key) {
		String value = configPropertiesMap.get(key);
		CustomAssert.assertTrue(value != null,
				"Properties not found corresponding to " + key);
		return StringUtils.trimToEmpty(value);
	}
}
