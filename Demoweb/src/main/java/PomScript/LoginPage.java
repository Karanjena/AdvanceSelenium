package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindAll({@FindBy(id="Email"),@FindBy(xpath="//input[@id='Email']")})
	private WebElement username;
	
	@FindAll({@FindBy(id="Password"),@FindBy(xpath="//input[@id='Password']")})
	private WebElement password;
	
	@FindAll({@FindBy(id="Log in"),@FindBy(xpath="//input[@value='Log in']")})
	private WebElement loginlink;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginlink() {
		return loginlink;
	}
	
	//bussiness logic
	
		public void loginFuction() {
			username.sendKeys("jenakaran2@gmail.com");
			password.sendKeys("Karan@000");
			loginlink.click();
		}

}
