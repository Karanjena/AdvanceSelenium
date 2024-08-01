package GeneriUtility;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select select;
	public static Actions action;
	public static JavascriptExecutor js;
	
	/**
	 * this method is used to navigate to any website
	 * @param url
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * this method is used to fetch the current webpage url
	 * @return String
	 */
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * this method is used to get the Source code of the webpage
	 * @return String
	 */
	public static String pageSource() {
		return driver.getPageSource();
	}
	
	/**
	 * this method is used to get the title of webpage
	 * @return String
	 */
	public static String title() {
		return driver.getTitle();
	}
	
	/**
	 * this method is used to current window id of the webpage
	 * @return String
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();
	}
	
	/**
	 * this method is used to the get allwindow ids of the webpage
	 * @return Set<String>
	 */
	public static Set<String> allWindow(){
		return driver.getWindowHandles();
	}
	
	/**
	 * this method is used to maximize the Window
	 */
	 public static void maximize() {
		driver.manage().window().maximize();
	 }
	 
	 /**
	  * this method is used to 
	  */
	 public static void forward() {
		 driver.navigate().forward();
	 }
	 
	 /**
	  * this method is used to go back to previous page
	  */
	 public static void back() {
		 driver.navigate().back();
	 }
	 
	 /**
	  * this method is used to navigate to any webpage by navigation method
	  * it will not wait for all the element to be load,it will start working immedianty
	  * @param url
	  */
	 public static void toUtl(String url) {
		 driver.navigate().to(url);
	 }
	 
	 /**
	  * this method is used to close the window
	  */
	 public static void windowClose() {
		 driver.close();
	 }
	 
	 /**
	  * this method is used to close the allWindow As well As Stop the  Server
	  */
	 public static void AllWindowQuit() {
		 driver.quit();
	 }
	 
	 
	 public static void explicitWait(WebElement element) {
		 wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
	 }
	 
	 public static void dropdown(int index, WebElement element) {
		 select=new Select(element);
		 select.selectByIndex(index);
	 }
	 
	 public static void dropdown(String value, WebElement element) {
		 select=new Select(element);
		 select.selectByValue(value);
		 
	 }
	 
	 public static void dropdown(WebElement element,String visibletext) {
		 select=new Select(element);
		 select.selectByVisibleText(visibletext);
		 
	 }
	 /**
	  * this method is used to move the cursor to the targeted webelement
	  * @param element
	  */
	 public static void moveCursor(WebElement element) {
		 action=new Actions(driver);
		 action.moveToElement(element).perform();
	 }
	 
	 /**
	  * this method is used to do the right click on the targeted webelement
	  * @param element
	  */
	 public static void rightClick(WebElement element) {
		 action=new Actions(driver);
		 action.contextClick(element).perform();
	 }
	 
	 /**
	  * this method is used to do the double click on the targeted Webelement
	  * @param element
	  */
	 public static void double_Click(WebElement element) {
		 action=new Actions(driver);
		 action.doubleClick(element).perform();
	 } 
	 
	 /**
	  * this method is used to do the drag and drop element from source to destination
	  * @param source
	  * @param destination
	  */
	 public static void drag_And_Drop(WebElement source,WebElement destination) {
		 action=new Actions(driver);
		 action.dragAndDrop(source,destination).perform();
	 } 
	 
	 /**
	  * this method is used to do the click on the targeted webelement
	  * @param element
	  */
	 public static void click_Element(WebElement element) {
		 action=new Actions(driver);
		 action.click(element).perform();
	 }
	 /**
	  * this method is used to do the click on the any where webelement
	  */
	 public static void click_Element() {
		 action=new Actions(driver);
		 action.click().perform();
	 }
}
