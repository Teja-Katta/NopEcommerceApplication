package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_010 extends BaseClass{
	
	//Login with valid credentials.

	@Test(groups= {"sanity","master","regression"})
	public void test() {
	
	HomePage hp=new HomePage(driver);
	logger.info("Test Starting...");
	hp.clkLoginButton();
	logger.info("Clicked on the login menu button...");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(p.getProperty("userName"));
	logger.info("User Name Provided....");
	lp.setpassword(p.getProperty("password"));
	logger.info("Password provided");
	lp.clkOnLoginButton();
	logger.info("click action on the Login button");
	logger.info("Validation starting");
	if(lp.LoginUnSuccessfulMessage()==true)
	{
		Assert.assertTrue(true);
		logger.info("Test got pass...");
	}
	else
	{
		
			Assert.assertTrue(false);
			logger.error("Test got fail...");
		
		
	}
	}

}
