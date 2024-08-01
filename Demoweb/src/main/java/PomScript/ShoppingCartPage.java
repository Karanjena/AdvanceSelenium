package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{


	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement item_1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement item_2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement item_3;
	
	@FindBy(xpath="(//input[@type='checkbox'])[4]")
	private WebElement terms_condition;

	public WebElement getItem_1() {
		return item_1;
	}

	public WebElement getItem_2() {
		return item_2;
	}

	public WebElement getItem_3() {
		return item_3;
	}
	
	public WebElement getTerms_condition() {
		return terms_condition;
	}
	
}

