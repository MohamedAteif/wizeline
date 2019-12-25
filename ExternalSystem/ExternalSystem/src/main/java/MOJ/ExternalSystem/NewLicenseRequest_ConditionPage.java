package MOJ.ExternalSystem;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLicenseRequest_ConditionPage extends PageBase 
{
	public NewLicenseRequest_ConditionPage(WebDriver Driver) 
	{
		super(Driver);
	}

	@FindBy(id = "acceptConditions")
	WebElement acceptConditionsCheckBox;

	@FindBy(xpath = "(//button[@class='btn btn-brand'])[1]")
	WebElement AcceptBtn;
	
	protected void AcceptLicenseRequestCondition() 
	{
		CLickAction(acceptConditionsCheckBox);
		CLickAction(AcceptBtn);
	}
	

}
