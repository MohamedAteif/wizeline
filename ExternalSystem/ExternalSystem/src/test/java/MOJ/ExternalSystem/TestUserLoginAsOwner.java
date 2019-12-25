package MOJ.ExternalSystem;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MOJ.ExternalSystem.HomePage;
import MOJ.ExternalSystem.LoginPage;
import MOJ.ExternalSystem.NewLicenseRequest_ConditionPage;

public class TestUserLoginAsOwner extends TestBase

{
	LoginPage LoginObject;
	HomePage HomeObject;
	NewLicenseRequest_ConditionPage NewLicenseRequest_ConditionObject;

	@Test
	public void Test_User_Login_As_valid() throws InterruptedException 
	{
		HomeObject = new HomePage(Driver);
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.linkText("JOIN UTEST"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}
		
		HomeObject.ClickOnLicenseRequestLink(); 
		
		LoginObject= new LoginPage(Driver);
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.id("firstName"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}
		
		LoginObject.UserLogin("emailjnvjknfvk@emailasxcvdfrews.com");
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.xpath("(//div/h1//span)[1]"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}
		
	}
	@Test(priority=1)
	public void Test_User_Login_not_valid() throws InterruptedException 
	{
		HomeObject = new HomePage(Driver);
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.linkText("JOIN UTEST"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}
		
		HomeObject.ClickOnLicenseRequestLink(); 
		
		LoginObject= new LoginPage(Driver);
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.id("firstName"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}
		
		LoginObject.UserLogin("invalid");
		
		for (int second = 0;; second++) {

			if (second >= 60) {
				fail();
			}
			try {
				if (isElementPresent(
						By.id("emailError"),
						Driver))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000); 
		}

	}
	
	public  boolean isElementPresent(By by, WebDriver driver) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	

}
