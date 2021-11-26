package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy (linkText= "Catalog")
    public WebElement catalog;
    
    public void clickonCatalog () {
    	catalog.click();
    }
}
