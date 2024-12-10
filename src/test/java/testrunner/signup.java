package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="D:\\Workspace\\Selenium_cucumber\\Feature\\fullreg.feature",
		glue="stepdefinition",
		dryRun=false,
		plugin= {"pretty","html:target-cucumber"},
		monochrome=true,
		tags="@validname"
		)

public class signup {

	
	
	
	
}
