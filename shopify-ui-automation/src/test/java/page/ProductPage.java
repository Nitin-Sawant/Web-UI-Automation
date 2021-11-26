package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public ProductPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText ="14k Bloom Earrings" )
	public WebElement Product1;
	
	@FindBy(partialLinkText ="14k Dangling Obsidian Earrings" )
	public WebElement Product2;

	public void clickonproducts() {
		Product1.click();
		Product2.click();
	}
}
