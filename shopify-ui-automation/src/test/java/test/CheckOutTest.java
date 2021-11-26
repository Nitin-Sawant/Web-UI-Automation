package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import page.AddToCartPage;
import page.CheckOutPage;
import page.DashboardPage;
import page.LoginPage;
import page.ProductPage;
import page.ViewMyCartPage;

public class CheckOutTest extends BaseClass{
	LoginPage loginPage;
	AddToCartPage addtocartPage;
	DashboardPage dashboardPage;
	ProductPage productPage;
	ViewMyCartPage viewmycartPage;
	CheckOutPage checkoutPage; 
	

	@BeforeMethod
	public void init() {
		initialization();
		loginPage = new LoginPage(driver);
		addtocartPage = new AddToCartPage(driver);
		dashboardPage= new DashboardPage(driver);
		productPage = new ProductPage(driver);
		viewmycartPage = new ViewMyCartPage(driver);
		checkoutPage = new CheckOutPage(driver);
		loginPage.logintoshopify();
	}

	@Test
	public void CheckoutSuccessTest() {
		dashboardPage.catalog.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		productPage.Product1.click();
		addtocartPage.btn_addtomycart.click();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(addtocartPage.btn_continueShopping)).click();
	    driver.navigate().back();
		productPage.Product2.click();
		addtocartPage.btn_addtomycart.click();
		wait.until(ExpectedConditions.elementToBeClickable(viewmycartPage.btn_viewmycart)).click();
		
		js.executeScript("window.scrollBy(0,500)", "");
		checkoutPage.btn_checkout.click();
		Assert.assertTrue(checkoutPage.label_subTotal.isDisplayed());
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
