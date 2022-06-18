package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Class\\\\Selenium\\\\New folder\\\\chromedriver (2).exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/popup.php");
		System.out.println(Driver.getTitle());
		String ParentWindow=Driver.getWindowHandle();
		System.out.println(Driver.getTitle() +" Parent Window");
		Driver.findElement(By.xpath("//a[@href=\"../articles_popup.php\"]")).click();
		System.out.println(Driver.getTitle() +" Child Window");
		Driver.findElement(By.xpath("//a[@href=\"http://demo.guru99.com/insurance/v1/index.php\"]")).click();
		Driver.switchTo().window(ParentWindow);
		Driver.quit();
	}

}
