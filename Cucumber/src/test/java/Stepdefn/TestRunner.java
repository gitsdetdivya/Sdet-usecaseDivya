package Stepdefn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
      
   features = "src/test/java/Feature/Login.feature",
   //path of step definition file
   glue = "Stepdefn",
   tags = "@last",
   //monochrome = true,
    plugin = { "pretty", "html: target/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
  //path of feature file
  		//= {"pretty","html:target/cucumbernew.html"},
  		// = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
  		// = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

   )

    public class TestRunner {
	
	
}