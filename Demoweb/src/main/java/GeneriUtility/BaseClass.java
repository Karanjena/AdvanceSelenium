package GeneriUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebdriverUtility{

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("Before Suite got executed", true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("Before Test got executed", true);
	}
	
	@BeforeClass
	public void tolunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Reporter.log("Before Class got executed", true);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Before Method got executed", true);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("After Method got executed", true);
	}
	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("After Class got executed", true);
		driver.quit();
		
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("After Test got executed", true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("After Suite got executed", true);
	}
	
	
}
