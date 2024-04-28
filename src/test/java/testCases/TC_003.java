package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_003 extends BaseClass{
	
	@Test(groups= {"sanity","master","regression"})
	public void LoginPageTest()
	{
		logger.info("Test starting....");
		HomePage hp=new HomePage(driver);
		logger.info("Clicking on the loggin button..");
		hp.clkLoginButton();
		LoginPage lp=new LoginPage(driver);
		logger.info("validating login title");
		if(lp.titleOfLoginPage().equalsIgnoreCase("Welcome, Please Sign In!"))
		{
			logger.info("Test got pass....");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test got fail....");
			Assert.assertTrue(false);
		}
	}

}
