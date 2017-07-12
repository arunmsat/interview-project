package com.interview.seleniumTest.vechileDetailsSteps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interview.seleniumTest.util.DriverFactory;
import com.interview.seleniumTest.util.PropertyReader;
import com.interview.seleniumTest.vechileDetailsPages.GetVehicleInfoStartPage;
import com.interview.seleniumTest.vechileDetailsPages.RegistrationNumInputPage;
//import com.interview.seleniumtest.util.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetVehicleInfoStartPageSteps extends DriverFactory
{	
	//PageFactory is an inbuilt Page Object Model concept for Selenium WebDriver 
	GetVehicleInfoStartPage get_vehicle_info_startPage=PageFactory.initElements(driver, GetVehicleInfoStartPage.class);
	
	
     
	@When("^I click on the Start_now_button$")
	public void I_click_on_the_Start_now_button() throws Throwable 
	{
		
		get_vehicle_info_startPage.i_click_on_the_Start_now_button();
	}
	
	

	
}
