package First_Package;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Second {
	WebDriver Driver;

	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite----Steup system property for chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest-----launch chrome Browser");
		Driver = new ChromeDriver();
	}

	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass-----login method");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod-----Enter URL");
		Driver.get("https://WWW.google.com");
	}

	// Test Cases annotations--starting with @Test

	@Test()
	public void googleTitleTest() {
		String title = Driver.getTitle();
		System.out.println(title);
		boolean b = title.equals("Google");
//		assertEquals(true, b);
		Assert.assertEquals(title, "oogle", "Title is not matched");
	}

	@Test(dependsOnMethods = "googleTitleTest")
	public void googleSearch() throws InterruptedException {
		Driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Santosh D. Gadekar");
		Thread.sleep(5000);
	}

	@Test(dependsOnMethods = "googleTitleTest")
	public void googleLogoTest() {
		boolean b = Driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
		System.out.println(b);
	}

	@Test(dependsOnMethods = "googleTitleTest")
	public void mailLinkTest() {
		boolean b = Driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}

	@Test(timeOut=2000, expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void infiniteLoopTest() {
		int i = 1;
		while (i == 1) {
		}
	}

	@Test(timeOut=2000, expectedExceptions=NumberFormatException.class)
	public void numberFormatException() {
		String x = "100A";
		int o = Integer.parseInt(x);
		System.out.println(o);
	}

	// Post-conditions annotations--starting with @After
	@AfterMethod // 6
	public void logOut() {
		System.out.println("@AfterMethod------logout from app");
	}

	@AfterClass // 7
	public void deletAllCookies() {
		System.out.println("@AfterClass------Close Browser");
		Driver.manage().deleteAllCookies();
	}

	@AfterTest // 8
	public void closeBrowser() {
		System.out.println("@AfterTest------delet all Cookies");
		Driver.close();
	}

	@AfterSuite // 9
	public void generateTestReport() {
		System.out.println("@AfterSuite-------generate test report");
	}
}
