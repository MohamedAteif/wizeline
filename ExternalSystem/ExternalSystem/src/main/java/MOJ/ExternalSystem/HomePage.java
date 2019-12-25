package MOJ.ExternalSystem;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase 
{
	public HomePage(WebDriver Driver) 
	{
		super(Driver);
	}

	@FindBy(linkText = "JOIN UTEST")
	WebElement JoinUTEST;

	protected void ClickOnLicenseRequestLink() 
	{
		CLickAction(JoinUTEST);
	}
	

}
