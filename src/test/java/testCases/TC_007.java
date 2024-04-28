package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_007 extends BaseClass{
	
	//TC_007. Verify the Working functionality of gender change to male to female.
	
	@Test(groups= {"sanity","master","regression"})
	public void genderTest()
	{
		logger.info("Test starting...");
		HomePage hp=new HomePage(driver);
		
		hp.clkOnRegisterButton();
		logger.info("Click action on the register button...");
		RegisterPage rp=new RegisterPage(driver);
		rp.selectGender();
		logger.info("select male gender");
		rp.clkFemaleRadioButton();
		logger.info("select female gender");
		logger.info("validation starting....");
		
		if(rp.femaleRadioButtonIsActive()==true)
		{
			Assert.assertTrue(true);
			logger.info("Test got pass...");
			
		}
		else {
			if(rp.maleRadioButtonIsActive()==true)
			{
				Assert.assertTrue(false);
				logger.error("Test got fail...");
			}
		}
	}

}
