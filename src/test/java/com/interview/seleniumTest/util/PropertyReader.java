package com.interview.seleniumTest.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class PropertyReader {

	
	Properties properties = new Properties();
	InputStream inputStrea = null;
	
	public PropertyReader() {
	 loadProperties();
	}
	
	private void loadProperties() {
	try {
	     inputStrea = new FileInputStream(System.getProperty("user.dir")+ "//src//test//java//com//interview//seleniumTest//config//test_config.properties");
	     properties.load(inputStrea);
	} catch (IOException e) {
	   e.printStackTrace();
	  }
	}

	public String readProperty(String key) {
	 return properties.getProperty(key);
	}

	
	 

}
