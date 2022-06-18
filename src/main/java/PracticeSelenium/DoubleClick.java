package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
//		Driver.get("https://mypage.rediff.com/login/dologin");
//		Driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Login\"]")).click();
//		Alert alt=Driver.switchTo().alert();
//		if(alt.getText().equals("Please enter valid email")) {
//			System.out.println("Please enter valid details");
//			alt.accept();
//		}
//		else {
//			System.out.println("Incorrect Alert");
//		}
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(Driver);
		WebElement aa=Driver.findElement(By.xpath("//*[text()=\"Double-Click Me To See Alert\"]"));
		action.doubleClick(aa).perform();
		
		Thread.sleep(5000);
		Alert alt=Driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		action.contextClick(aa);
		
		File scrFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(scrFile,new File("E:\\\\Naveen Automation Selenium Class\\\\Error ScreenShot\\\\screenshot.png"));
		
		Thread.sleep(5000);
//		WebElement aa=Driver.findElement(By.id("txtlogin"));
//				aa.sendKeys("santosh");
//		action.click(aa);
//		action.keyDown(Keys.CONTROL);
//		
//		action.sendKeys(aa, "A");
//		Thread.sleep(5000);
//		action.sendKeys(aa, "C");
//		action.keyUp(Keys.CONTROL);
//		action.sendKeys(Keys.TAB);
//		Thread.sleep(5000);
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys(aa, "V");
//		Thread.sleep(5000);
//		action.keyUp(Keys.CONTROL);
		
//		Driver.get("https://www.browserstack.com/");
//		Actions action=new Actions(Driver);
//		action.moveToElement(Driver.findElement(By.xpath("//*[@class=\"nav_item_name\" and contains(text(),\"Developers\")]"))).build().perform();
//		action.keyDown(Driver., null)
		
	Thread.sleep(5000);
		
		Driver.quit();
	}
	
}
