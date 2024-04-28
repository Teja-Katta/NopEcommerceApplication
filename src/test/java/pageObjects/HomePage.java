package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Actions act=new Actions(driver);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@FindBy (xpath="//a[normalize-space()='Register']")
    private WebElement registerButton;	

	@FindBy (xpath="//a[@class='ico-login']")
    private WebElement loginButton;
	
	@FindBy (xpath="//li[@id='topcartlink']")
    private WebElement cartButton;
	
	@FindBy (xpath="//span[@class='wishlist-label']")
	private WebElement wishlist;
	
	@FindBy (xpath="//a[@class='ico-account']")
	private WebElement MyaccountButton;
	
	@FindBy (xpath="//a[normalize-space()='Log out']")
	private WebElement logoutButton;
	
	@FindBy (xpath="//body/div[@class='master-wrapper-page']/div[@class='header-menu']/ul[@class='top-menu notmobile']/li[1]")
	private WebElement computerCatgmenu;
	
	
	@FindBy (xpath="//ul[@class='top-menu notmobile']//li[5]")
	private WebElement booksCatgmenu;
	
	
	public void clkOnBooksCategory()
	{
		act.moveToElement(booksCatgmenu).click().perform();
	}
	
	public void clkOnComputerCategory()
	{
		act.moveToElement(computerCatgmenu).perform();
	}
	
	public boolean LogoutIsDisplay()
	{
		boolean logout=logoutButton.isDisplayed();
		return logout;
	}
	
	public void clkOnLogout()
	{
		logoutButton.click();
	}
	
	public boolean MyaccountIsDisplyed()
	{
		boolean menu=MyaccountButton.isDisplayed();
		return menu;
	}
	
	public void clkOnWishlist()
	{
		js.executeScript("arguments[0].click();", wishlist);
	}
	
	public void clkOnShoppingCart()
	{
		//js.executeScript("arguments[0].click();", cartButton);
		cartButton.click();
	}
	
	
	public void clkLoginButton()
	{
		act.moveToElement(loginButton).click().perform();
	}
	
	
	public void clkOnRegisterButton()
	{
		registerButton.click();
	}
	
	
	public String titleHomePage()
	{
		String title=driver.getTitle();
		return title;
	}

}
