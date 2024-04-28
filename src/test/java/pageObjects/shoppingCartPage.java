package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartPage extends BasePage{

	public shoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//div[@class='page-title']")
	private WebElement titleOfShoppingcart;
	
	public boolean titleShoppingCart()
	{
		boolean title=titleOfShoppingcart.isDisplayed();
		return title;
	}

}
