package steps;

import org.openqa.selenium.WebDriver;

import helper.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginpage extends BaseClass                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            {

	
	
	
	
	@Given("login with valid credentials")
	public void login_with_valid_credentials() {
      //page.openPage();
      page.login();

 	}
	@When("check home page")
	public void check_home_page() {
		 System.out.println("ajay");
	}
	@When("check details")
	public void check_details() {
		 System.out.println("ajay");
	}
	@Then("validate login")
	public void validate_login() {
		 System.out.println("ajay");
	}
}
