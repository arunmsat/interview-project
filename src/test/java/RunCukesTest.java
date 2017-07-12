
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

   @CucumberOptions (strict = false, features = "src/test/resources/", tags={"@createProjectWithMandatoryFields"}, plugin= {"pretty",
 //@CucumberOptions (strict = false, features = "src/test/resources/", tags={"@MessagesForVechileDetailsNotFound, @getVechileMakeAndColour, @ErrMsgForVehicleRegistrationNumber"}, plugin= {"pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber-report.json",
        "junit:target/cucumber-results.xml" } )
       


public class RunCukesTest {
	
}