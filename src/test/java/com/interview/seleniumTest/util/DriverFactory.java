package com.interview.seleniumTest.util;


import java.io.File;
import java.lang.ref.PhantomReference;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;



public class DriverFactory {
	
protected static WebDriver driver;
Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
public DriverFactory() {
  initialize();
 }

 public void initialize() {
 if (driver == null)
   createNewDriverInstance();
 }

 private void createNewDriverInstance() 
 {
   String browser = new PropertyReader().readProperty("browser");
   if (browser.equalsIgnoreCase("firefox")) 
    { 
	  
	   driver = new FirefoxDriver();
	} else if(browser.equalsIgnoreCase("chrome")) 
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chrome//chromedriver.exe");
		 driver=new ChromeDriver();	 
	    
	} else if(browser.equalsIgnoreCase("IE"))
	{
		 //set the IE server exe path and initialize it
		 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//IE//IEDriverServer.exe");
		 driver=new InternetExplorerDriver();	
	}else if(browser.equalsIgnoreCase("HtmlUnitDriver"))
	{
		
		 driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		 ((HtmlUnitDriver) driver).setJavascriptEnabled(true);	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }else if(browser.equalsIgnoreCase("Xvfb"))
	{
		
    	// Setup firefox binary to start in Xvfb        
        String Xport = System.getProperty("lmportal.xvfb.id", ":1");
        final File firefoxPath = new File(System.getProperty("lmportal.deploy.firefox.path", "/usr/bin/firefox"));
        FirefoxBinary firefoxBinary = new FirefoxBinary(firefoxPath);
        firefoxBinary.setEnvironmentProperty("DISPLAY", Xport);

        // Start Firefox driver
        driver = new FirefoxDriver(firefoxBinary, null);
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
   } 
    
   
   if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("IE"))
   {   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }
   
  
  }
 

 public WebDriver getDriver() {
  return driver;
 }

 
 public void destroyDriver() {
  driver.quit();
  driver = null;
 }
 
 
 }
