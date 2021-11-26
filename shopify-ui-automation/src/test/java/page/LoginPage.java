package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id="password")
    public WebElement textbox_login;
    
    @FindBy(xpath= "//button[@type= 'submit']")
    public WebElement btn_enter;
	
    public void logintoshopify() {
    	 textbox_login.sendKeys("brauff");
    	 btn_enter.click();
    }
}
	
