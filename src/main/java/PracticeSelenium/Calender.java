package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://demoqa.com/automation-practice-form");
		WebElement db = Driver.findElement(By.id("dateOfBirthInput"));
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].click", db);
		String dob = "24-01-1992";
		String DB[] = dob.split("-");
		String day = DB[0];
		String month = DB[1];
		String year = DB[2];
		Select selectmonth = new Select(
				Driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
		selectmonth.selectByVisibleText(month);
		Select selectyear = new Select(
				Driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
		selectyear.selectByVisibleText(year);
		String beforeXpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[";
		String afterXpath = "]/div[";
		final int totalWeekDays = 7;
		boolean flag = false;
		for (int rowNum = 1; rowNum <= 6; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {
				String dayValue = Driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]"))
						.getText();
				if (dayValue.equals(day)) {
					Driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag == true) {
				break;
			}
		}
		Driver.quit();
	}
}
