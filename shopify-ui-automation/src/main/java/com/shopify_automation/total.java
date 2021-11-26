package com.shopify_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class total {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize(); //maximize window
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa-practical-test.myshopify.com");
		driver.findElement(By.id("password")).sendKeys("brauff");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		driver.findElement(By.linkText("Catalog")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.partialLinkText("14k Bloom Earrings")).click();
		driver.findElement(By.name("add")).click();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Continue shopping']")))).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("14k Dangling Obsidian Earrings")).click();
		driver.findElement(By.name("add")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("cart-notification-button")))).click();
		js.executeScript("window.scrollBy(0,500)", "");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("checkout")))).click();
		
	}	
}

