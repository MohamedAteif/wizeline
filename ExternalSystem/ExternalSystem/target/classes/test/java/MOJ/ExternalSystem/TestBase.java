package MOJ.ExternalSystem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
	protected  WebDriver Driver;
	String ChromeDriverpath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";

	@BeforeMethod
	public void Open_External_System()
	{
		System.setProperty( "webdriver.chrome.driver", ChromeDriverpath);
		Driver = new ChromeDriver();
		Driver.navigate().to("https://www.utest.com/");
		Driver.manage().window().maximize();
	}


	@AfterMethod
	public void Close_External_System()
	{ 
		//Driver.quit(); 
	}



}
