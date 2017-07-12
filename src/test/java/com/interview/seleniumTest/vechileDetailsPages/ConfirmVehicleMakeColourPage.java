package com.interview.seleniumTest.vechileDetailsPages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.seleniumTest.util.PropertyReader;

//import com.interview.seleniumtest.util.PropertyReader;

public class ConfirmVehicleMakeColourPage {
	WebDriver driver;
	WebDriverWait wait; 
	Logger APP_LOG=Logger.getLogger("devpinoyLogger");
		
		
	@FindBy(id = "Vrm")
	private WebElement registrationNoInputField;
	
	
	@FindBy(xpath = "//div[@id='pr3']/div/ul/li[1]/span[2]")
	private WebElement registrationNoField;

	@FindBy(xpath = "//div[@id='pr3']/div/ul/li[2]/span[2]")
	private WebElement vehicleMakeField;
	
	@FindBy(xpath = "//div[@id='pr3']/div/ul/li[3]/span[2]")
	private WebElement vehicleColourField;
	

	
	
	public ConfirmVehicleMakeColourPage(WebDriver driver) {
	this.driver = driver;
	
	}



	public boolean the_vehicle_information_for_make_and_colour_should_be_displayed_along_with_entered_registration_number(String expected_vechicleMake, String expected_vechicleColour, String expected_vehicleRegistrationNo) 
	{
		 APP_LOG.debug("Verifying Vehicle Make and Colour for the entered Registration Number");
		  
		 wait = new WebDriverWait(driver, 10); 
		 wait.until(ExpectedConditions.visibilityOf(vehicleColourField));
		 
         String actual_vechicleMake=vehicleMakeField.getText();
         String	actual_vechicleColour=vehicleColourField.getText();
         String actual_vehicleRegistrationNo=registrationNoField.getText();
         
         boolean isVehicleDetailsCorrect=false;
         if(actual_vechicleMake.equals(expected_vechicleMake) || actual_vechicleColour.equals(expected_vechicleColour) || actual_vehicleRegistrationNo.equals(expected_vehicleRegistrationNo))
        	 isVehicleDetailsCorrect=true;
        return isVehicleDetailsCorrect;
		 
		 
			
			 
			 
	}
	
	


}
