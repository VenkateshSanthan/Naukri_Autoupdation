package org.gmail.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public  void launchUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	public void type(WebElement element, String data) {
		element.sendKeys(data);
		
	}

	

	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
