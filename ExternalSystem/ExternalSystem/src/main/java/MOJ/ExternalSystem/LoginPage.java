package MOJ.ExternalSystem;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends PageBase 
{
	public LoginPage(WebDriver Driver) 
	{
		super(Driver);
	}

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id =  "email")
	WebElement email;
	
	@FindBy(id = "birthMonth")
	WebElement birthMonth;
	
	@FindBy(xpath = "//div[@id='birthMonth']/input[@type='search']")
	WebElement birthMonthTP;
	
	@FindBy(id = "birthDay")
	WebElement birthDay;
	
	@FindBy(xpath = "//div[@id='birthDay']/input[@type='search']")
	WebElement birthDayTP;
	
	@FindBy(id = "birthYear")
	WebElement birthYear;
	
	@FindBy(xpath = "//div[@id='birthYear']/input[@type='search']")
	WebElement birthYearTP;
	
	@FindBy(id = "genderCode")
	WebElement genderCode;
	
	@FindBy(xpath = "//div[@id='genderCode']/input[@type='search']")
	WebElement genderCodeIP;
	
	@FindBy(xpath = "/html//section[@id='regs_container']/div[@class='container-fluid']//form[@name='userForm']//a[@role='button']/span[.='Next: Location']")
	WebElement NextLocation;
	
	

	protected void UserLogin(String Email) throws InterruptedException 
	{
		
		
		
		CLickAction(firstName);
		SendKeysAction(firstName , "Test");
		
		Thread.sleep(500);
		
		CLickAction(lastName);
		SendKeysAction(lastName , "Case");
		Thread.sleep(500);
		CLickAction(email);
		SendKeysAction(email , Email);
		Thread.sleep(500);
		CLickAction(birthMonth);
		SendKeysAction(birthMonthTP , "January");
		birthMonthTP.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		CLickAction(birthDay);
		Thread.sleep(500);
		SendKeysAction(birthDayTP , "30");
		Thread.sleep(500);
		birthDayTP.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		CLickAction(birthYear);
		Thread.sleep(500);
		SendKeysAction(birthYearTP , "1990");
		Thread.sleep(500);
		birthYearTP.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		CLickAction(genderCode);
		Thread.sleep(500);
		
		SendKeysAction(genderCodeIP , "Female");
		Thread.sleep(500);
		genderCodeIP.sendKeys(Keys.ENTER);
		
		Thread.sleep(500);
		CLickAction(NextLocation);
		
		
		
		
		
		

	}

}
