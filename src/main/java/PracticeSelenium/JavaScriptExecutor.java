package PracticeSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("Title---------" + Driver.getTitle());
		WebElement google=Driver.findElement(By.xpath("//*[text()=\"Double-Click Me To See Alert\"]"));
		drawBorder(google, Driver);
		flash(google, Driver);
		generateAlert(Driver, "There is a problem in the webpage");
		Alert alt = Driver.switchTo().alert();
		System.out.println(alt.getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alt.accept();
		refreshpage(Driver);
		getTitle(Driver);
		scroleUpDown(Driver);
		scrollIntoView(google, Driver);
		Driver.quit();
	}

	public static void flash(WebElement element, WebDriver Driver) {
		String bgColor = element.getCssValue("backgroundColor");
		changeColor("rgb(0,200,0)", element, Driver);
		screenshot(Driver);
		changeColor(bgColor, element, Driver);

	}

	public static void changeColor(String color, WebElement element, WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void drawBorder(WebElement element, WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		screenshot(Driver);
	}

	public static void screenshot(WebDriver Driver) {
		File scr = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFileToDirectory(scr,
					new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\SAntoshddddd"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateAlert(WebDriver Driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void click(WebElement element, WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].click()", element);
	}

	public static void refreshpage(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("history.go(0)");
	}

	public static void getTitle(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
	}

	public static void scroleUpDown(WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}

	public static void scrollIntoView(WebElement element, WebDriver Driver) {
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
