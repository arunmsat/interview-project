package com.interview.seleniumTest.vechileDetailsSteps;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.interview.seleniumTest.util.DriverFactory;
import com.interview.seleniumTest.util.PropertyReader;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class DVLAvehicleInformationStartingSteps extends DriverFactory{
	Logger APP_LOG=Logger.getLogger("devpinoyLogger");
	
	@Before
	public void beforeScenario() {
	System.out.println("this will run before the actual scenario");
	}
	
	
 
 
 @After
 public void afterScenario(Scenario scenario) 
 {
	System.out.println("this will run after scenario is finished, even if it failed");
	String browser = new PropertyReader().readProperty("browser");
	if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("IE") || browser.equalsIgnoreCase("Xvfb"))
	{   
	  if (scenario.isFailed()) 
	  {
          final byte[] screenshot = ((TakesScreenshot) driver)
                      .getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png"); //paste it in the report
      }
	}	   
	new DriverFactory().destroyDriver();
	
 }
	
	@Given("^I go to \"([^\"]*)\"$")
	public void setup(String DVLA_URL) throws Throwable 
	{
	 System.out.println("first statement");	
	 driver = new DriverFactory().getDriver();
	 System.out.println("Navigating to Get vehicle information from DVLA");
	 APP_LOG.debug("Navigating to Get vehicle information from DVLA -  using browser "+ new PropertyReader().readProperty("browser"));	
	 driver.get( new PropertyReader().readProperty(DVLA_URL));
	
	
	}
	
	
	
	
}
