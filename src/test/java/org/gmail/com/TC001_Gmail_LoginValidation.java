package org.gmail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC001_Gmail_LoginValidation extends BaseClass {
	@Test
	void gmailLoginValidation() throws InterruptedException {

		BaseClass b = new BaseClass();
		LoginPojo lp = new LoginPojo();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.bomba.md/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath(""));
		
		
		
		
		
//		driver.quit();
	}

}
