package Stepdefn;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Library.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
	
public class hooktest extends Baseclass {
		


@AfterStep

public void takeScraenshotOnFailure(Scenario scenario)  {
	

		if (!scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", "screenshot");
		
		}

		}




		@After(order = 0)
		public void tearDown() {
		driver.close();

		}
}
