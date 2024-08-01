package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//a[text()='Register']")
		private WebElement register_Link;
		
		@FindBy(xpath="//a[text()='Log in']")
		private WebElement log_in;
		
		@FindBy(xpath="//span[text()='Shopping cart']")
		private WebElement Shopping_cart;
		
		@FindBy(linkText="Digital downloads")
		private WebElement Digital_Download;
		
		@FindBy(xpath="//button[@id='checkout']")
		private WebElement checkout;
		
		
		public WebElement getRegister_Link() {
			return register_Link;
		}

		public WebElement getLog_in() {
			return log_in;
		}


		public WebElement getShopping_cart() {
			return Shopping_cart;
		}
		
		public WebElement getDigital_Download() {
			return Digital_Download;
		}

		public WebElement getCheckout() {
			return checkout;
		}

		
	}

