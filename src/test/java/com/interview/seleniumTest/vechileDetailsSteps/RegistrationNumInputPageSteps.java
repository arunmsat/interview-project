package com.interview.seleniumTest.vechileDetailsSteps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.seleniumTest.util.DriverFactory;
import com.interview.seleniumTest.util.PropertyReader;
import com.interview.seleniumTest.vechileDetailsPages.RegistrationNumInputPage;
//import com.interview.seleniumtest.util.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationNumInputPageSteps extends DriverFactory
{	
	RegistrationNumInputPage registration_no_input_page=PageFactory.initElements(driver, RegistrationNumInputPage.class);
	

	
	
	@When("^I enter the registration number \"([^\"]*)\" of the vehicle$")
	public void I_enter_the_registration_no_of_the_vehicle(String registrationNo) throws Throwable {
	 
		registration_no_input_page.i_enter_the_registration_no_of_the_vehicle(registrationNo);
	}
	
	
	
	@And("^I click on the Continue_button$")
	public void i_click_on_the_Continue_button() throws Throwable {
	 
		registration_no_input_page.i_click_on_the_continue_button();
	}
	
	
	@Then("^an error message \"([^\"]*)\" is displayed to user$")
	public void An_error_message_is_displayed_to_user(String errorMessage) throws Throwable {
	 
		boolean isErrorMessageCorrect=registration_no_input_page.An_error_message_is_displayed_to_user(errorMessage);
		Assert.assertTrue("Incorrect error message or No error message", isErrorMessageCorrect);
	}
	
	
}
