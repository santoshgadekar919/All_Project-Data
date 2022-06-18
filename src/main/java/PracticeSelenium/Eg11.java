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


public class Eg11 {
static WebDriver Driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Class\\Selenium\\New folder\\chromedriver (2).exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.get("https://www.google.com/");
		WebElement SearchBar=Driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		SearchBar.sendKeys("Hello");
		flash(SearchBar, Driver);
		drawBorder(SearchBar, Driver);
		generateAlert(SearchBar, "Here is a problem, please check");
		Alert alert=Driver.switchTo().alert();
		alert.accept();
		WebElement SearchBtn=Driver.findElement(By.xpath("//input[@value=\"Google Search\"]"));
		clickElement(SearchBtn, Driver);
		refreshWebPage(Driver);
		System.out.println(getPageSource(Driver));
		System.out.println(getTitleofPage(Driver));
		scrollbyValue(Driver,5000);
		Thread.sleep(5000);
		scrollPageUp(Driver);
		WebElement Htt=Driver.findElement(By.xpath("//h3[text()=\"Hello (Lionel Richie song) - Wikipedia\"]"));
		scrollintoView(Htt, Driver);
		Thread.sleep(5000);
		drawBorder(Htt,Driver);
		clickElement(Htt, Driver);
	}
	
	public static void flash(WebElement element, WebDriver Driver) {
		String bgColor=element.getCssValue("backgroundColor");
		for(int i=0; i<=100; i++) {
			changeColor("rgb(0, 200, 0)", element, Driver);
			changeColor(bgColor, element, Driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
	}
	
	public static void drawBorder(WebElement element, WebDriver Driver) throws IOException {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='10px solid black'", element);
		screenShot();
	}
	
	public static void screenShot() throws IOException {
		File srcFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(srcFile, new File("C:\\Users\\santo\\eclipse-workspacet\\FinalPractice\\Screenshot"));
	}
	public static void generateAlert(WebElement element, String message) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("alert ('"+message+"')");
	}
	
	public static void clickElement(WebElement element, WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].click();",element);
	}
	public static void refreshWebPage(WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleofPage(WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageSource(WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		String pageSource=js.executeScript("return document.documentElement.innerText;").toString();
		return pageSource;
	}
	public static void scrollbyValue(WebDriver Driver, int a) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("window.scrollTo(0,'"+a+"')");
	}
	public static void scrollPageUp(WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	public static void scrollintoView(WebElement element, WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
