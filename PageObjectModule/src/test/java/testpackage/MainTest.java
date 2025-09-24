package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.CartPageObject;
import pageobjects.LoginPageObject;
import pageobjects.Payment;

public class MainTest {
@Test
public void allTest () throws InterruptedException {
WebDriverManager.chromedriver().setup(); // no manual download needed
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://rahulshettyacademy.com/client/#/auth/login");
     Thread.sleep(3000);
     PageFactory.initElements(driver, LoginPageObject.class);
     LoginPageObject.username.sendKeys("Rolex27@gmail.com");
     LoginPageObject.password.sendKeys("Rolex@28");
    // LoginPageObjects.//password(driver).click();
     LoginPageObject.login.click();
     Thread.sleep(3000);
     PageFactory.initElements(driver, CartPageObject.class);
    
     CartPageObject.Addtocart.click();

     Thread.sleep(3000);
     CartPageObject.cartpage.click();
     Thread.sleep(3000);
     CartPageObject.checkout.click();
     
     Payment.cardnumber(driver).clear();
     Payment.cardnumber(driver).sendKeys("222 3333 4444 5555");
     Payment.expmonth(driver, "05");
     Thread.sleep(3000);
     Payment.expyear(driver, "26");
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     WebElement CVV = wait.until(ExpectedConditions.visibilityOf(Payment.cc(driver)));
     CVV.sendKeys("001");
     Payment.Name(driver).sendKeys("Rolex");
     Thread.sleep(3000);
     Payment.countrydropdown(driver,"India");
     Payment.orderplace(driver).click();
   
}
}
