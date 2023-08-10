package Stepdefn;

import java.awt.AWTException;
import java.io.IOException;
import Library.Baseclass;
import Library.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
      
       Baseclass Bc ;
      
		Browser br ;
		


	@Given("user navigates to the website")
	public  void user_navigates_to_the_website() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	        Bc = new Baseclass ();
			
              Bc.StartBrowser();
              
                            
	}
	
	@When("User Click on Services")
	public void user_click_on_services() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		 br = new Browser();

		br.Getmenulist();

	}
	
	@When("User Click on Contact us")
	public void user_click_on_contact_us() throws InterruptedException, AWTException {
		 br = new Browser();

		br.contactus();
	}
	
	@When("User validates Error Message")
	public void user_validates_error_message() throws InterruptedException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
		 br = new Browser();

		br.Validations();
	}

	
	@When("close chrome driver")
	public void close_chrome_driver() {
	 br = new Browser();

		br.close();
	}
	
	@Given("User Click on About us")
	public void user_click_on_about_us() throws InterruptedException, AWTException {
		 br = new Browser();

		br.Aboutus();
	}

	@Given("user clicks on Leadership")
	public void user_clicks_on_leadership() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Print")
	public void print() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	


}
