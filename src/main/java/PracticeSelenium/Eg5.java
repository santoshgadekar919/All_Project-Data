package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eg5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		
		File scrFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\src\\main\\java\\PracticeSelenium\\scr.png"));
//	    FileUtils.copyFileToDirectory(scrFile, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\scrscr.png"));		
		
		
		
		
//		File scrFile3=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFileToDirectory(scrFile3, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\SAntoshddddd"));
		Driver.quit();
	}
}

