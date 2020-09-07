package Test_PageObjectPattern;

import org.openqa.selenium.WebDriver;

import ObjectRepository_PageObjectPattern.RediffLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends RediffLoginPage{
	

		
		public stepDefinition(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	
     WebDriver driver;
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
     driver.get("https://mail.rediff.com");
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in $")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
      
    }

    @And("^Click on Login in home page to land on Secure sign in Page$")
    public void click_on_login_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
        
    }

}
