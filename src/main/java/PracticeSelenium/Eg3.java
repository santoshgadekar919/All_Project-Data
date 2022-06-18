package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Class\\\\Selenium\\\\New folder\\\\chromedriver (2).exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(Driver,25);
		Driver.get("http://www.seleniumframework.com/Practiceform/");
		Driver.findElement(By.id("alert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=Driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		WebElement NewWindow=Driver.findElement(By.id("button1"));
		String parentWind=Driver.getWindowHandle();
		System.out.println(Driver.getTitle());
		NewWindow.click();
		Driver.manage().window().maximize();
		System.out.println(Driver.getTitle());
		String childWind=Driver.getWindowHandle();
		Driver.switchTo().window(parentWind);
		Thread.sleep(5000);
	}

}
