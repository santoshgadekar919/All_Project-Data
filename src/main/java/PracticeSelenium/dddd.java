package PracticeSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dddd {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
//		System.setProperty("webdriver.gecko.driver", "E:\\Naveen Automation Selenium Class\\Driver and JAR File\\geckodriver.exe");
//		WebDriver Driver1=new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "E:\\Naveen Automation Selenium Class\\Driver and JAR File\\msedgedriver.exe");
//		WebDriver Driver2=new EdgeDriver();
		Driver.get("https://www.google.com");
		Driver.navigate().to("https://www.gmail.com");
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
//		System.out.println(Driver.getPageSource());
		Driver.navigate().to("https://www.facebook.com");
		Driver.findElement(By.id("email")).sendKeys("santoshgadekar.919@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.findElement(By.id("email")).clear();
		Driver.findElement(By.linkText("Forgotten password?")).click();
		Driver.navigate().back();
		WebElement d=Driver.findElement(By.xpath("//*[text()=\"Create New Account\"]"));
		System.out.println(d.getAttribute("id"));
		System.out.println(d.isDisplayed());
		System.out.println(d.isEnabled());
		Driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement se=Driver.findElement(By.id("sex-0"));
		System.out.println(se.isDisplayed());
		System.out.println(se.isEnabled());
		System.out.println(se.isSelected());
		se.click();
		System.out.println(se.isSelected());
		WebElement SS=Driver.findElement(By.id("continents"));
		Select select=new Select(SS);
		select.selectByIndex(4);
		System.out.println(select.isMultiple());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wt=new WebDriverWait(Driver, 20);
		wt.until(ExpectedConditions.elementToBeClickable(SS));
		Driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
		List<WebElement> btns=Driver.findElements(By.tagName("button"));
		System.out.println(btns.size());
//		for(WebElement ww:btns) {
//			System.out.println(ww.getText());
//		}
		Driver.findElement(By.id("alert")).click();
		wt.until(ExpectedConditions.alertIsPresent());
		Alert alt=Driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		String ParentWindow=Driver.getWindowHandle();
		System.out.println(ParentWindow);
		Driver.findElement(By.id("button1")).click();
		String ChildWindow=Driver.getWindowHandle();
		Driver.switchTo().window(ChildWindow);
		System.out.println(ChildWindow);
		Driver.switchTo().window(ParentWindow);
		Set<String> handles=Driver.getWindowHandles();
		System.out.println(handles);
		Driver.quit();
	}
}
