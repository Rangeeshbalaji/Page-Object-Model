package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageObject {

	@FindBy(xpath = "(//button[contains(@class,'btn w-40')]/following-sibling::button)[2]")
	public  static WebElement Addtocart;
	@FindBy(css = "button[routerlink='/dashboard/cart']")
	public static WebElement cartpage;
	@FindBy(xpath = "//button[normalize-space(text())='Checkout']")
	public static WebElement checkout;

}
