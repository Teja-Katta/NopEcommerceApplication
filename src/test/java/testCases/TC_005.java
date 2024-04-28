package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.shoppingCartPage;
import testBase.BaseClass;

public class TC_005 extends BaseClass{
	//Verify whether click on the shopping cart menu button it will navigate to the proper page or not. 
	@Test(groups= {"sanity","master","regression"})
	public void shoppingCartPageTest()
	{
		logger.info("Test starting.....");
		HomePage hp=new HomePage(driver);
		logger.info("Click on the shopping cart feature.....");
		hp.clkOnShoppingCart();
		
		shoppingCartPage scp=new shoppingCartPage(driver);
		logger.info("validate shopping cart page with title..");
		if(scp.titleShoppingCart()==true)
		{
			logger.info("Test got pass.....");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test got fail...");
		
			Assert.assertTrue(false);
		}
	}

}
