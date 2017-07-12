package com.interview.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyReader {

	
	Properties properties = new Properties();
	InputStream iStream = null;
	
	public PropertyReader() {
	 loadProperties();
	}
	
	private void loadProperties() {
	try {
	     iStream = new FileInputStream(System.getProperty("user.dir")+ "//src//main//java//com//interview//config//config.properties");
	     properties.load(iStream);
	} catch (IOException e) {
	   e.printStackTrace();
	  }
	}

	public String readProperty(String key) {
	 return properties.getProperty(key);
	}

	
	 

}
