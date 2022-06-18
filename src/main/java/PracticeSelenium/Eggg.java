package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eggg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.navigate().to("https://demoqa.com/droppable");
		WebElement Frame=Driver.findElement(By.xpath("//span[text()=\"Browser Windows\"]"));
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("arguments[0].click();", Frame);
//		Driver.switchTo().frame("frame1");
//		System.out.println(Driver.findElement(By.id("sampleHeading")).getText());
//		Driver.switchTo().parentFrame();
//		System.out.println(Driver.getTitle());
//		List<WebElement> links=Driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		File scr=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scr, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\src\\main\\java\\PracticeSelenium\\scr.png"));
//		FileUtils.copyFileToDirectory(scr, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\SAntoshddddd"));
//		Driver.switchTo().frame("frame2");
//		System.out.println(Driver.findElement(By.id("sampleHeading")).getText());
		Driver.findElement(By.id("tabButton")).click();
		Set<String> windows=Driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		System.out.println(parent);
		String child=it.next();
		System.out.println(child);
		Driver.switchTo().window(child);
		String s=Driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(s);
		Driver.close();
		Driver.switchTo().window(parent);
		System.out.println(Driver.getTitle());
		Driver.quit();
	}
}
