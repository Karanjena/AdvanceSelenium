package GeneriUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebdriverUtility{

	/**
	 * this method is used to scroll the webpage according to the x axis and y axis
	 * @param x
	 * @param y
	 */
	public static void scroll_By(int x,int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * this method is used to scroll the webpage from the resume point
	 * @param x
	 * @param y
	 */
	public static void scroll_To(int x,int y) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * this method is used to scroll the page until the element is visible
	 * @param b
	 * @param element
	 * @param index
	 */
	public static void scroll_In_To_Viwe(Boolean b,WebElement element,int index) {
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments["+index+"].viwe("+b+");,"+element+"");
	}
	/**
	 * this method is used the 
	 * @param element
	 * @param index
	 */
	public static void clickDisable(WebElement element,int index) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
}
