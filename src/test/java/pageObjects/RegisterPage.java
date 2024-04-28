package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Actions act=new Actions(driver);
	
	@FindBy (xpath="//h1[normalize-space()='Register']")
	private WebElement registerTitle;
	
	@FindBy (id="gender-male")
	private WebElement gender;
	
	@FindBy (id="FirstName")
	private WebElement FirstName;
	
	@FindBy (id="LastName")
	private WebElement lastName;
	
	@FindBy (name="DateOfBirthDay")
	private WebElement date;
	
	@FindBy (name="DateOfBirthMonth")    
	private WebElement month;
	
	@FindBy (name="DateOfBirthYear")    
	private WebElement year;
	
	@FindBy (id="Email")
	private WebElement email;
	
	@FindBy (id="Company")
	private WebElement companyName;
	
	@FindBy (id="Password")
	private WebElement password;
	
	@FindBy (id="ConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy (xpath="//div[@class='result']")
	private WebElement userRegistrationSuccessMessage;
	
	@FindBy (id="register-button")
	private WebElement RegistrationSubmitButton;
	
	@FindBy (id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy (xpath="//div[@class='buttons']")
	private WebElement registerContinueButton;
	
	@FindBy (id="FirstName-error")
	private WebElement firstNameErrorMessage;
	
	@FindBy (id="LastName-error")
	private WebElement lastNameErrorMessage;
	
	@FindBy (id="Email-error")
	private WebElement emailErrorMessage;  
	
	@FindBy (id="Password-error")
	private WebElement passwordErrorMessage;
	
	@FindBy (xpath="//span[@id='Password-error']//ul")
	private WebElement passwordConditionErrorMessage;
	
	@FindBy (xpath="//div[@class='message-error validation-summary-errors']")
	private WebElement emailAlreadyExistingErrorMessage;
	
	@FindBy (id="Email-error")
	private WebElement InvalidEmailErrorMessage;
	
	
	public void tabKeyAction()
	{
		act.sendKeys(Keys.TAB).perform();
	}
	
	public boolean invalidEmailErrorMessage()
	{
		boolean txt=InvalidEmailErrorMessage.isDisplayed();
		return txt;
	}
	
	
	public boolean emailAlreadyExistErrorMessage()
	{
		boolean txt=emailAlreadyExistingErrorMessage.isDisplayed();
		return txt;
	}
	
	
	public boolean passwordConditionErrorMessage()
	{
		boolean err_password=passwordConditionErrorMessage.isDisplayed();
		return err_password;
	}
	
	public boolean passwordErrorMessage()
	{
		boolean err_password=passwordErrorMessage.isDisplayed();
		return err_password;
	}
	
	public boolean emailErrorMessage()
	{
		boolean err_email=emailErrorMessage.isDisplayed();
		return err_email;
	}
	
	public boolean lastnameErrorMessage()
	{
		boolean err_last=lastNameErrorMessage.isDisplayed();
		return err_last;
	}
	
	
	public boolean firstnameErrorMessage()
	{
		boolean err_first=firstNameErrorMessage.isDisplayed();
		return err_first;
	}
	
	public void clkOnContinueButton()
	{
		registerContinueButton.click();
	}
	
	
	public boolean maleRadioButtonIsActive()
	{
		boolean m=gender.isSelected();
		return m;
	}
	public boolean femaleRadioButtonIsActive()
	{
		boolean f=femaleRadioButton.isSelected();
		return f;
	}
	
	public String male()
	{
		String gen="male";
		return gen;
	}
	
	public String female()
	{
		String gen="female";
		return gen;
	}
	
	public void clkFemaleRadioButton()
	{
		act.moveToElement(femaleRadioButton).click().perform();
	}
	
	public void clkOnSubmitButton()
	{
		act.moveToElement(RegistrationSubmitButton).click().perform();
	}
	
	public boolean txtRegistrationSuccessMessage()
	{
		boolean successMessage=userRegistrationSuccessMessage.isDisplayed();
		return successMessage;
	}
	
	public void setConfirmPassword(String user_confirmPassword)
	{
		confirmPassword.sendKeys(user_confirmPassword);
	}
	
	public void setPassword(String user_password)
	{
	        password.sendKeys(user_password);
	}
	public void setCompanyName(String user_companyName)
	{
		companyName.sendKeys(user_companyName);
	}
	
	
	public void setEmailAddress(String user_email)	
	{
		email.sendKeys(user_email);
	}
	
	public void setYearDrp(String user_year)
	{
		Select drp=new Select(year);
		drp.selectByVisibleText(user_year);
	}
	
	
	public void setMonthDrp(String user_month)
	{
		Select drp=new Select(month);
		drp.selectByVisibleText(user_month);
	}
	
	public void setDateDrp(String user_date)
	{
		Select drp=new Select(date);
		drp.selectByVisibleText(user_date);
	}
	
	
	public void setLastName(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	
	public void setFirstName(String name)
	{
		FirstName.sendKeys(name);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	
	public String registerPageTitle()
	{
		String title=registerTitle.getText();
		return title;
	}

}
