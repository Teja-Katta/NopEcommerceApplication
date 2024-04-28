package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class RegistrationDataDrivenTest extends BaseClass{
	
	
	@Test(dataProvider="RegistrationTest", dataProviderClass=DataProviders.class)	
	public void registrationDdtTest(String firstName, String lastName, String date, String month, String year,
			String email, String company, String password, String confPassword, String result)
	{
		try {
			
		logger.info("Test starting...");
		HomePage hp=new HomePage(driver);
		logger.info("Click action on the register button...");
		hp.clkOnRegisterButton();
		
		RegisterPage rp=new RegisterPage(driver);
	    rp.selectGender();
	    logger.info("select gender");
	    rp.setFirstName(firstName);
	    rp.tabKeyAction();
	    logger.info("Entered first name");
	    rp.setLastName(lastName);
	    rp.tabKeyAction();
	    logger.info("Entered last name");
	    rp.setDateDrp(date);
	    rp.tabKeyAction();
	    logger.info("selected date");
	    rp.setMonthDrp(month);
	    rp.tabKeyAction();
	    logger.info("selected month");
	    rp.setYearDrp(year);
	    rp.tabKeyAction();
	    logger.info("selected year");
	    rp.setEmailAddress(email);
	    rp.tabKeyAction();
	    logger.info("Entered email address");
	    rp.setCompanyName(company);
	    rp.tabKeyAction();
	    logger.info("Entered company name");
	    rp.setPassword(password);
	    logger.info("Entered password");
	    rp.setConfirmPassword(confPassword);
	    logger.info("Entered confirm password");
	    rp.clkOnSubmitButton();
	    logger.info("Clicked on the submit button");
	    logger.info("validate with success message.");
	    if(result.equalsIgnoreCase("valid"))
	    {
	    	if(rp.txtRegistrationSuccessMessage()==true)
	    	{
	    		Assert.assertTrue(true);
	    		logger.info("Test got pass...");
	    		rp.clkOnContinueButton();
	    		hp.clkOnRegisterButton();
	    	}
	    	
	    	else
	    	{
	    	  if(rp.firstnameErrorMessage()==true)
		    	{
	    		  Assert.assertTrue(false);
		    	 logger.error("Test got fail...");
		    	 driver.navigate().refresh();
		    	}
	    	  else if(rp.lastnameErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.emailErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    	  
	    	  else if(rp.invalidEmailErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    	  
	    	  else if(rp.emailAlreadyExistErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.passwordErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.passwordConditionErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(false);
			    	 logger.error("Test got fail...");
			    	 driver.navigate().refresh();
	    	  }
	    		
	    	}
	    }
	    
	    if(result.equalsIgnoreCase("invalid"))
	    {
	    	if(rp.txtRegistrationSuccessMessage()==true)
	    	{
	    		Assert.assertTrue(false);
		    	 logger.error("Test got fail...");
	    		rp.clkOnContinueButton();
	    		hp.clkOnRegisterButton();
	    	}
	    	
	    	else
	    	{
	    	  if(rp.firstnameErrorMessage()==true)
		    	{
	    		  Assert.assertTrue(true);
		    	 logger.info("Test got pass...");
		    	 driver.navigate().refresh();
		    	}
	    	  else if(rp.lastnameErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.emailErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    	  
	    	  else if(rp.invalidEmailErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    	  
	    	  else if(rp.emailAlreadyExistErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.passwordErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    	  else if(rp.passwordConditionErrorMessage()==true)
	    	  {
	    		  Assert.assertTrue(true);
			    	 logger.info("Test got pass...");
			    	 driver.navigate().refresh();
	    	  }
	    		
	    	}
	    }
		}
		catch(Exception e)
		{
			Assert.assertTrue(false);
			 logger.error("getting an exception...");
		}
	
	}

}
