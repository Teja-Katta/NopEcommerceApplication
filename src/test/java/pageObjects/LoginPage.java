package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@FindBy (xpath="//div[@class='page-title']")
	private WebElement loginTitle;
	
	
	@FindBy (id="Email")
	private WebElement EmailtxtaField;
	
	
	@FindBy (id="Password")
	private WebElement passwordtxtaField;
	

	@FindBy (xpath="//button[normalize-space()='Log in']")
	private WebElement loginSubmitButton;
	
	@FindBy (xpath="//div[@class='message-error validation-summary-errors']")
	private WebElement loginUnSuccessfulMessage;
	
	
	public boolean LoginUnSuccessfulMessage()
	{
		boolean txt=loginUnSuccessfulMessage.isDisplayed();
		return txt;
	}
	
	
	public void clkOnLoginButton()
	{
		loginSubmitButton.click();
	}
	
	
	public void setpassword(String passcode)
	{
		passwordtxtaField.sendKeys(passcode);
	}
	
	public void setUserName(String email)
	{
		EmailtxtaField.sendKeys(email);
	}
	
	
	public String titleOfLoginPage()
	{
		String title=loginTitle.getText();
		return title;
	}

}
