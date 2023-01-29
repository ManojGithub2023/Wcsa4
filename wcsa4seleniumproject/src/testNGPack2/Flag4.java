package testNGPack2;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	static WebDriver driver;

	@Test
	public void loginMethod() 
	{
		Reporter.log("Log IN is Done!!", true);
	}

	@Test(dependsOnMethods = "loginMethod")
	public void createUser() 
	{
		Reporter.log("User Created!!", true);
	}

	@Test(dependsOnMethods = "createUser")
	public void logOutMethod() 
	{
		Reporter.log("Logout Done!!", true);
	}
}
