package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMyCartPage {
	
	public ViewMyCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id= "cart-notification-button")
	public WebElement btn_viewmycart;

	public void clickonviewcart() {
		btn_viewmycart.click();
	}
}
