package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helper.BaseClass;
import locators.LoginPageElements;

public class LoginPage extends BaseClass {

	
	
	public LoginPageElements page=null;
	
	
	
	public LoginPage()
	{
		
		
		page=new LoginPageElements();
		PageFactory.initElements(driver,page);
	}
	
	
	
	public void login()
	{
		page.userName.sendKeys("Admin");
		page.password.sendKeys("admin123");
		page.clickOnSubmit.click();
		
	}
}
