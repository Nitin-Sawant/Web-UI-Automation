package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	public CheckOutPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="checkout")
	public WebElement btn_checkout;
	
	@FindBy (xpath="//span[contains(@class,'original-total')]")
	public WebElement label_subTotal;
}
