package com.interview.seleniumTest.vechileDetailsSteps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.seleniumTest.util.DriverFactory;
import com.interview.seleniumTest.util.PropertyReader;
import com.interview.seleniumTest.vechileDetailsPages.ConfirmVehicleMakeColourPage;
import com.interview.seleniumTest.vechileDetailsPages.GetVehicleInfoStartPage;
import com.interview.seleniumTest.vechileDetailsPages.RegistrationNumInputPage;
//import com.interview.seleniumtest.util.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfirmVehicleMakeColourPageSteps extends DriverFactory
{	
	ConfirmVehicleMakeColourPage confirm_vehicle_makecolour_page=PageFactory.initElements(driver, ConfirmVehicleMakeColourPage.class);
	
	
	@Then("^the  vehicle information for make \"([^\"]*)\" and colour \"([^\"]*)\" should be displayed along with the entered registration number \"([^\"]*)\"$")
	public void The_vehicle_information_for_make_and_colour_should_be_displayed_along_with_entered_registration_number(String vechicleMake, String vechicleColour, String RegistrationNo) throws Throwable {
		
		boolean isVehicleDetailsCorrect=confirm_vehicle_makecolour_page.the_vehicle_information_for_make_and_colour_should_be_displayed_along_with_entered_registration_number(vechicleMake, vechicleColour, RegistrationNo);  
	    Assert.assertTrue("Vechicle Details (Make/Colour) is incorrect or error on page", isVehicleDetailsCorrect);
	}
	
	

	
}
