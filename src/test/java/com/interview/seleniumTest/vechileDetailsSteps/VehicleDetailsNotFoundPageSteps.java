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
import com.interview.seleniumTest.vechileDetailsPages.VehicleDetailsNotFoundPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VehicleDetailsNotFoundPageSteps extends DriverFactory
{	
	VehicleDetailsNotFoundPage vehicle_details_not_found_page=PageFactory.initElements(driver, VehicleDetailsNotFoundPage.class);
	
	//Then a following message informing the next steps should be displayed to user
	@Then("^the following message informing the next steps should be displayed to user$")
	public void the_following_message_informing_the_next_steps_should_be_displayed_to_user(String vechileNotFoundMessage) throws Throwable {
		
		boolean isVehicleDetailsNotFoundMessageCorrect=vehicle_details_not_found_page.the_following_message_informing_the_next_steps_should_be_displayed_to_user(vechileNotFoundMessage);  
	    Assert.assertTrue("Vechicle Not Found nessage is incorrect or error on page", isVehicleDetailsNotFoundMessageCorrect);
	}
	
	

	
}
