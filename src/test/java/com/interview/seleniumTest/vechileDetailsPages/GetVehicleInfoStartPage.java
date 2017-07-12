package com.interview.seleniumTest.vechileDetailsPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.seleniumTest.util.PropertyReader;

//PageFactory is an inbuilt Page Object Model concept for Selenium WebDriver 

public class GetVehicleInfoStartPage {
	WebDriver driver;
	WebDriverWait wait; 
	Logger APP_LOG=Logger.getLogger("devpinoyLogger");
		
		
	@FindBy(linkText = "Start now")
	private WebElement startNowButton;
	

	
	
	public GetVehicleInfoStartPage(WebDriver driver) {
	this.driver = driver;
	
	}

	
	public void i_click_on_the_Start_now_button() 
	{
	   APP_LOG.debug("Clicking on the Start Now button on the DVLA get vehicle info page");
	 
		 wait = new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.visibilityOf(startNowButton));
		 startNowButton.click();
		
	}
	
	
	

}
