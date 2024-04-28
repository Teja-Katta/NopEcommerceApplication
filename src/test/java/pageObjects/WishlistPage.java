package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage{

	public WishlistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//div[@class='page-title']")
	private WebElement wishlistTitle;
	
	public boolean titleOfWishlist()
	{
		boolean title=wishlistTitle.isDisplayed();
		return title;
	}

}
