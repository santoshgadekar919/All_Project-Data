package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Eg10 {

	public static void main(String[] args) {
		WebDriver Driver=new HtmlUnitDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("https://www.google.com");
		System.out.println("Title---------" +Driver.getTitle());
		 System.out.println(Driver.getCurrentUrl());
		Driver.quit();
	}
}
