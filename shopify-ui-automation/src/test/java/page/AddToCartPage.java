package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public AddToCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
       @FindBy (name = "add")
       public WebElement btn_addtomycart;
       
       @FindBy (xpath = "//button[text()='Continue shopping']")
       public WebElement btn_continueShopping;
	
       

}
