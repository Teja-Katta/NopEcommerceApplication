package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.WishlistPage;
import testBase.BaseClass;

public class TC_004 extends BaseClass{
	
	//TC_004. Verify while click action on the WhisList feature it should open proper page or not.
	
	@Test(groups= {"sanity","master","regression"})
	public void validateWishListPage()
	{
		logger.info("Test starting.....");
		HomePage hp=new HomePage(driver);
		logger.info("Click action on the wishlist button");
		hp.clkOnWishlist();
		WishlistPage wp=new WishlistPage(driver);
		logger.info("validating title of the wishlist page");
		if(wp.titleOfWishlist()==true)
		{
			logger.info("Test got pass.....");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test got fail.....");
			Assert.assertTrue(false);
		}
	}

}
