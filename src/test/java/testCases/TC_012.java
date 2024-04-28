package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BooksCategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_012 extends BaseClass{
	
	//Add the product to wishlist
	
	@Test(groups= {"sanity","master","regression"})
	public void AddProductToTheWishlist() throws InterruptedException
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
		System.out.println("email id: "+emailString);
		rp.setEmailAddress(emailString);
		logger.info("Enter company name");
		rp.setCompanyName(randomeString()+ "pvt ltd");
		String password=randomAlphaNumeric();
		System.out.println("Passcode: "+password);
		logger.info("set password");
		rp.setPassword(password);
		logger.info("Set confirm password");
		rp.setConfirmPassword(password);
		logger.info("Click on the submit button");
		rp.clkOnSubmitButton();
		logger.info("Registration validate with success message.");
		rp.clkOnContinueButton();
		logger.info("Clicked on the Continue button.");
		hp.clkLoginButton();
		logger.info("Click on the Continue button.");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(emailString);
		logger.info("email provided");
		lp.setpassword(password);
		logger.info("password provided");
		lp.clkOnLoginButton();
		logger.info("click on the Login button.");
		hp.clkOnBooksCategory();
		logger.info("click on the books menu button.");
		BooksCategoryPage bcp=new BooksCategoryPage(driver);
		
		bcp.clkOnBookWishListButton();
		logger.info("click on the product wishlist button.");
		
		if(bcp.AddWishlistSuccessMessage()==true)
		{
			Assert.assertTrue(true);
			logger.info("test got pass");
		}
		else
		{
			Assert.assertTrue(false);
			logger.error("test got fail");
		}
		Thread.sleep(5000);
		
	}

}
