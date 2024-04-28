package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_009 extends BaseClass{
	
	
	@Test(groups= {"sanity","master","regression"})
	public void loginInvalidTest()
	{
		logger.info("Test starting...");
		HomePage hp=new HomePage(driver);
		logger.info("Click action on the register button...");
		hp.clkOnRegisterButton();
		RegisterPage rp=new RegisterPage(driver);
		logger.info("select male gender");
		rp.selectGender();
		logger.info("Provide first name");
		rp.setFirstName(randomeString());
		//Thread.sleep(5000);
		logger.info("Provide last name");
		rp.setLastName(randomeString());
		logger.info("Select date");
		rp.setDateDrp("25");
		logger.info("Select month");
		rp.setMonthDrp("May");
		logger.info("Select year");
		rp.setYearDrp("1997");
		logger.info("Provide email address");
		String emailString=randomeString()+"@gmail.com";
		rp.setEmailAddress(emailString);
		logger.info("Enter company name");
		rp.setCompanyName(randomeString()+ "pvt ltd");
		String password=randomAlphaNumeric();
		logger.info("set password");
		rp.setPassword(password);
		logger.info("Set confirm password");
		rp.setConfirmPassword(password);
		logger.info("Click on the submit button");
		rp.clkOnSubmitButton();
		logger.info("Registration validate with success message.");
		rp.clkOnContinueButton();
		hp.clkLoginButton();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(emailString);
		lp.setpassword(emailString);
		lp.clkOnLoginButton();
		if(lp.LoginUnSuccessfulMessage()==true)
		{
			Assert.assertTrue(true);
			logger.info("Test got pass...");
		}
		else
		{
			if(hp.MyaccountIsDisplyed()==true)
			{
				Assert.assertTrue(false);
				logger.error("Test got fail...");
			}
			
		}
		
		
	}

}
