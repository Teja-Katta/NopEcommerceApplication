package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksCategoryPage extends BasePage{

	public BooksCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[3]")
    private WebElement BookWishlist;
	
	@FindBy (xpath="//p[@class='content']")
	private WebElement successMessageForAddWishlist;
	
	
	public boolean AddWishlistSuccessMessage()
	{
		boolean txt=successMessageForAddWishlist.isDisplayed();
		return txt;
	}
	
	public void clkOnBookWishListButton()
	{
		BookWishlist.click();
	}
}
