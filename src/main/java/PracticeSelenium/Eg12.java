package PracticeSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Class\\Selenium\\New folder\\chromedriver (2).exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.get("https://ui.cogmento.com");
		Driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("santoshgadekarjscoe@gmail.com");
		Driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Santosh24#");
		Driver.findElement(By.xpath("//*[contains(text(),\"Login\")]")).click();
		Actions action=new Actions(Driver);
		action.moveToElement(Driver.findElement(By.xpath("//i[@class=\"users icon\"]"))).build().perform();
		Driver.findElement(By.linkText("Contacts")).click();
		String Before_Xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/thead/tr/th[";
		String After_Xpath="]";
		List<WebElement> Collumns=Driver.findElements(By.xpath("//table[@class=\"ui celled sortable striped table custom-grid\"]/thead/tr/th"));
		List<WebElement> Rows=Driver.findElements(By.xpath("//table[@class=\"ui celled sortable striped table custom-grid\"]/tbody/tr"));
        for(int i=1; i<=Collumns.size();i++) {
        	System.out.println(Driver.findElement(By.xpath(Before_Xpath+i+After_Xpath)).getText());
        }
        System.out.println(Collumns.size());
    	System.out.println(Rows.size());
    
    	
    	for(int j=1;j<=6;j++) {
    		String el=Driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr["+j+"]/td[2]")).getText();
    	
    		System.out.println(el);
    		
    		if(el.contains("Santosh Dinkar Gadekar")) {
		WebElement eleo=Driver.findElement(By.xpath("//a[text()=\""+el+"\"]//parent::td//preceding-sibling::td//input[@name=\"id\"]"));
		clickElement(eleo,Driver);
		  }
    	}
    	
	}
	
	public static void clickElement(WebElement element, WebDriver Driver) {
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].click();",element);
	}
}
