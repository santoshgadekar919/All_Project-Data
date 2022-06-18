package PracticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Class\\Selenium\\New folder\\chromedriver (2).exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(Driver,25);
//		Driver.get("https://www.browserstack.com/");
		Actions action=new Actions(Driver);
//		action.moveToElement(Driver.findElement(By.id("developers-menu-toggle"))).build().perform();
//		Driver.findElement(By.linkText("Support")).click();
		Driver.navigate().to("https://demoqa.com/droppable");
//		action.clickAndHold(Driver.findElement(By.id("draggable"))).moveToElement(Driver.findElement(By.id("droppable"))).release().build().perform();
//		Thread.sleep(5000);
//		Driver.findElement(By.xpath("//*[text()=\"Alerts, Frame & Windows\"]")).click();
//		WebElement Frame=Driver.findElement(By.xpath("//span[text()=\"Frames\"]"));
//		JavascriptExecutor js=(JavascriptExecutor)Driver;
//		js.executeScript("arguments[0].click();", Frame);
//		Driver.switchTo().frame("frame1");
//		System.out.println(Driver.findElement(By.id("sampleHeading")).getText());
//		Driver.switchTo().defaultContent();
//		System.out.println(Driver.getTitle());
//		Driver.switchTo().frame("frame2");
//		System.out.println(Driver.findElement(By.id("sampleHeading")).getText());
		List<WebElement> list=Driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++) {
			String lis=list.get(i).getText();
			System.out.println(lis);
		}
		Driver.quit();
	}
}
