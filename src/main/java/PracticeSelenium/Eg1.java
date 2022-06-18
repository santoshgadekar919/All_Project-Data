package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Eg1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Class\\Selenium\\New folder\\chromedriver (2).exe");
//			System.setProperty("webdriver.gecko.driver", "E:\\Testing Class\\Selenium\\New folder\\geckodriver(1).exe");
			WebDriver Driver=new ChromeDriver();
//			WebDriver Driver1=new InternetExplorerDriver();
//			WebDriver Driver2=new OperaDriver();
//			WebDriver Driver3=new SafariDriver();
//			WebDriver Driver4=new HtmlUnitDriver();
//			WebDriver Driver1=new FirefoxDriver();
			Driver.manage().window().maximize();
			Driver.manage().deleteAllCookies();
			Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Driver.get("https://www.amazon.in/");
			Driver.navigate().to("https://www.facebook.com/");
			Driver.findElement(By.linkText("Forgotten password?")).click();
//			Driver.get("https://www.gmail.com/");
//			Driver.navigate().back();
//			Driver.navigate().forward();
//			Driver.navigate().back();
//			Driver.navigate().refresh();
			String a=Driver.getTitle();
			System.out.println(a);
			String b=Driver.getCurrentUrl();
//			System.out.println(b);
//			System.out.println(Driver.getPageSource());
			WebElement Username=Driver.findElement(By.id("email"));
			System.out.println(Username.getAttribute("id"));
			Username.sendKeys("santoshgadekarjscoe@gmail.com");
			boolean c=Username.isEnabled();
			System.out.println(c);
			WebElement FacebookLogo=Driver.findElement(By.xpath("//img[contains(@alt,\"Facebook\")]"));
			boolean d=FacebookLogo.isDisplayed();
			System.out.println(d);
			
		}
	}
