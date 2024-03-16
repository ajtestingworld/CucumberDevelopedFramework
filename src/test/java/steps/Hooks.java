package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.BaseClass;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class Hooks extends BaseClass
{
	
	
	//public static LoginPage page;
	
	

	public WebDriver driver;
	BaseClass b1=null;
	
	
	@Before
	public void launchBrowser()
	{
		
		b1=new BaseClass();
		driver=b1.LaunchBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	
	
}
