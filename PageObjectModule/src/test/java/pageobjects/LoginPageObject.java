package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	@FindBy(id ="userEmail")
	public static WebElement username; 
	@FindBy(id = "userPassword")
	public static WebElement password; 
	@FindBy(id ="login")
	public  static WebElement login;
	
}
