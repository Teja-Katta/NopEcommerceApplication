package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_002 extends BaseClass{
	
	//TC_002. Verify while click action on the Register feature it should open proper page or not.
	
	@Test(groups= {"sanity","master","regression"})
	public void registerPageTest()
	{
		logger.info("Test starting...");
		HomePage hp=new HomePage(driver);
		logger.info("Click action on the register button...");
		hp.clkOnRegisterButton();
		RegisterPage rp=new RegisterPage(driver);
		//System.out.println("Register text "+rp.registerPageTitle());
		logger.info("validate register title...");
		if(rp.registerPageTitle().equals("Register"))
		{
			logger.info("Test got pass...");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test got fail...");
			Assert.assertTrue(false);
		}
	}

}
