package testCases;

//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_006 extends BaseClass{
	//public Properties p;
	
	@Test(groups= {"sanity","master","regression"})
	public void registerWithValidData() 
	{
		//FileReader file=new FileReader(".//src/test/resources//config.Properties");
		//p=new Properties();
		//p.load(file);
		RegisterPage rp=new RegisterPage(driver);
		if(rp.male().equalsIgnoreCase(p.getProperty("registration_gender")))
		{
		logger.info("Test starting...");
		HomePage hp=new HomePage(driver);
		logger.info("Click action on the register button...");
		hp.clkOnRegisterButton();
		//RegisterPage rp=new RegisterPage(driver);
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
		rp.setEmailAddress(randomeString()+"@gmail.com");
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
		if(rp.txtRegistrationSuccessMessage()==true)
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
		else if(rp.female().equalsIgnoreCase(p.getProperty("registration_gender")))
		{
			logger.info("Test starting...");
			HomePage hp=new HomePage(driver);
			logger.info("Click action on the register button...");
			hp.clkOnRegisterButton();
			//RegisterPage rp=new RegisterPage(driver);
			logger.info("select female gender");
			rp.clkFemaleRadioButton();
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
			rp.setEmailAddress(randomeString()+"@gmail.com");
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
			if(rp.txtRegistrationSuccessMessage()==true)
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
		else
		{
			logger.error("Test got fail...");
			Assert.assertTrue(false);
		}
		
		//Thread.sleep(5000);
		
	}

}
