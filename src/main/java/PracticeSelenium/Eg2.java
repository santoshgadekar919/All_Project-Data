package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Testing Class\\Selenium\\New folder\\chromedriver (2).exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.toolsqa.com/selenium-training/");
	Driver.manage().deleteAllCookies();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(Driver,50);
	WebElement RegBtn=Driver.findElement(By.xpath("//a[@href=\"#enroll-form\" and text()=\"Go To Registration \"]"));
	String parentWind=Driver.getWindowHandle();
	JavascriptExecutor js=(JavascriptExecutor)Driver;
	js.executeScript("arguments[0].click", RegBtn);
	Driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Santosh");
	Driver.findElement(By.id("last-name")).sendKeys("Gadekar");
	Driver.findElement(By.name("email")).sendKeys("mayurisantosh9296@gmail.com");
	Driver.findElement(By.cssSelector("#mobile")).sendKeys("8855664422");
	WebElement SelCountry=Driver.findElement(By.id("country"));
	Select select=new Select(SelCountry);
	wait.until(ExpectedConditions.elementToBeClickable(SelCountry));
//	select.selectByIndex(1);
//	select.selectByValue("2");
	select.selectByVisibleText("United States");
	boolean a=select.isMultiple();
	System.out.println(a);
	Driver.findElement(By.id("city")).sendKeys("Pune");
	Driver.findElement(By.id("message")).sendKeys("Hello I am Santosh");
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(5000);
	String Captcha=Driver.findElement(By.xpath("//img[@class=\"upcoming__registration--captcha\"]")).getText();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=Driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	System.out.println(Captcha);
	Driver.findElement(By.xpath("//input[@id=\"code\"]")).sendKeys(Captcha);
	}
}
