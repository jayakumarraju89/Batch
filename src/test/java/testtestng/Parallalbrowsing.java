package testtestng;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.ThreadPoolExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.FailedReporter;



public class Parallalbrowsing {
	
	
	WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AK\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AK\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AK\\eclipse-workspace\\Testng\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//SoftAssert s = new SoftAssert();
		Assert.assertTrue(false);
	}

	/*@Test 
	public void test4() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\AK\\eclipse-workspace\\Testng\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com/");
	}*/
}
