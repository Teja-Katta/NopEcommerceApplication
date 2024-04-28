package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001 extends BaseClass{
	
	//TC_001. Verify when provide the url it opens proper page or not.
	//Validate with title:nopCommerce demo store
	
	@Test(groups= {"sanity","master","regression"})
	public void homePageTitleTest()
	{
	    logger.info("Home page opening..");
		HomePage hp=new HomePage(driver);
		System.out.println("Title:"+hp.titleHomePage());
		logger.info("validate the title of home page...");
		Assert.assertEquals(hp.titleHomePage(), "nopCommerce demo store");
		logger.info("Test finish....");
	}
	

}
