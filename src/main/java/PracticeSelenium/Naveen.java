package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Naveen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
//		Driver.get("https://www.selenium.dev");
//		System.out.println(Driver.getTitle());
//		System.out.println(Driver.getCurrentUrl());
//		if(Driver.getTitle().equals("Sele8ium")) {
//			System.out.println("Correct Title");
//		}
//		else {
//			System.out.println("Incorrect Title");
//		}
		Driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
//		Xpath
		Driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Santosh");	
//		id
		Driver.findElement(By.id("last-name")).sendKeys("Gadekar");
//		name
		Driver.findElement(By.name("email")).sendKeys("santoshgadekar.919@gmail.com");
//		linktext
//		Driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
//		Driver.findElement(By.linkText("Go To Registration ")).click();
//		Driver.navigate().back();
//		partial link text
//		Driver.findElement(By.partialLinkText("Go To")).click();
//		cssselector
		Driver.findElement(By.cssSelector("#mobile")).sendKeys("9923795869");
//		select class
		WebElement dd=Driver.findElement(By.cssSelector("#country"));
		Select select=new Select(dd);
		select.selectByIndex(5);
		Thread.sleep(5000);
//		class name
//		Driver.findElement(By.className("upcoming__registration--input")).sendKeys("Pune");
		Driver.findElement(By.tagName("button")).click();
		Driver.quit();
	}
}
