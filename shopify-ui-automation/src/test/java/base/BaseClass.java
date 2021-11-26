package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected WebDriver driver;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize(); //maximize window
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa-practical-test.myshopify.com");
	}

}
