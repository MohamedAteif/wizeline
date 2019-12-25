package MOJ.ExternalSystem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase 
{
	protected static WebDriver Driver;
	Select SelectList ;
	
	protected PageBase(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	protected void SelectAction(Select selectList ,String Value)
	{
		selectList.selectByValue(Value);
	}
	
	protected void SendKeysAction(WebElement Element , String Value)
	{
		Element.sendKeys(Value);
	}
	
	protected void CLickAction(WebElement Element)
	{
		Element.click();
	}
	
	
}
