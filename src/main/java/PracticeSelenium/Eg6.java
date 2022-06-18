package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg6 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Testing Class\\\\Selenium\\\\New folder\\\\chromedriver (2).exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
		File scrFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(scrFile, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\Screenshot"));
		Driver.quit();
	}
}
