package MOJ.ExternalSystem;

import org.testng.annotations.Test;

import MOJ.ExternalSystem.LoginPage;

public class TestUserLoginAsDelegate extends TestBase

{
	LoginPage LoginObject;
	@Test (priority =0)
	public void Test_User_Login_As_Delegator() 
	{
		LoginObject= new LoginPage(Driver); 
//		LoginObject.UserLogin("2");		
	}

}
