package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {
	public static WebElement cardnumber(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[@class='field']//input)[1]"));
		
	}
	public static void expmonth(WebDriver driver, String month) {
		WebElement monthdropdown = driver.findElement(By.xpath("(//select[@class='input ddl'])[1]"));
		Select select = new Select(monthdropdown);
		select.selectByVisibleText(month);
		
	}
	public static void expyear(WebDriver driver, String year) {
		WebElement yeardropdown = driver.findElement(By.xpath("(//div[@class='field small']//select)[2]"));
		Select select1 = new Select(yeardropdown);
		select1.selectByVisibleText(year);
		
	}
	public  static WebElement cc (WebDriver driver) {
		return driver.findElement(By.xpath("(//input[@class='input txt'])[1]"));
		
	}
	public static WebElement Name(WebDriver driver) {
		return driver.findElement(By.xpath("(//input[@class='input txt'])[2]"));
		
	}
	public static void countrydropdown(WebDriver driver,String country) {
		
		WebElement countries = driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
		countries.sendKeys(country);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement countryOption = wait.until(
	            ExpectedConditions.elementToBeClickable(
	                    By.xpath("//span[contains(normalize-space(),'" + country + "')]")));
	    countryOption.click();

	}
	public static WebElement orderplace(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(@class,'btnn action__submit')]"));
		
	}
}
