package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseClass {

	public static WebDriver driver;
	
	public static LoginPage page;
	
	public WebDriver gettDriver()
	{
		return driver;
	}
	
	
	public WebDriver LaunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		page=new LoginPage();
		
		return driver;
		
	}
	
	public void openPage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/loginWeb");
	}
}
