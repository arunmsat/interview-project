package com.interview.seleniumTest.vechileDetailsPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import com.interview.seleniumtest.util.PropertyReader;

public class RegistrationNumInputPage {
	WebDriver driver;
	WebDriverWait wait; 
	Logger APP_LOG=Logger.getLogger("devpinoyLogger");
		
		
	@FindBy(id = "Vrm")
	private WebElement registrationNoInputField;
	
	@FindBy(name = "Continue")
	private WebElement continueButton;
	
	//*[@id='Vrm-error']
	@FindBy(id = "Vrm-error")
	private WebElement ErrorMessageField;
	
	
	public RegistrationNumInputPage(WebDriver driver) {
	this.driver = driver;
	
	}


	public void i_enter_the_registration_no_of_the_vehicle(String registrationNo) 
	{
	   APP_LOG.debug("Entering the registration no in the input field");
	  
		 
		 wait = new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.visibilityOf(registrationNoInputField));
		 registrationNoInputField.sendKeys(registrationNo);
		 
		
	}


	public void i_click_on_the_continue_button() {
		   APP_LOG.debug("Clicking on Continue button");
			  
			 
			 wait = new WebDriverWait(driver, 10); 
			 wait.until(ExpectedConditions.visibilityOf(continueButton));
			 continueButton.click();
		
	}


	public boolean An_error_message_is_displayed_to_user(String expectedErrorMessage) {
		APP_LOG.debug("Verifying error messages to user on  entering invalid registration numbers");
		  
		 wait = new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.visibilityOf(ErrorMessageField));
		String  actualErrorMessage=ErrorMessageField.getText();
	    
		boolean isErrorMessageCorrect=false;
		if(actualErrorMessage.equals(expectedErrorMessage)) 
			isErrorMessageCorrect=true;
		return isErrorMessageCorrect;
	
		
	}


	
	
		
	}
	
	



