package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement registerlink;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}
	
}

