package org.gmail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Naukri_AutoUpdation {

	@Test
	void naukriAutoUpdation() throws InterruptedException {
		BaseClass b = new BaseClass();
		LoginPojo lp = new LoginPojo();
		WebDriver driver= b.launchBrowser();
		b.launchUrl(driver,"https://www.naukri.com/");
		Thread.sleep(2000);
//		b.btnClick(lp.getLoginFrnt());
				driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		Thread.sleep(2000);
//		b.type(lp.getTxtUesr(), "teshsg025@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("teshsg025@gmail.com");
//		b.type(lp.getTxtPass(),"770venki");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("770venki");
//		b.btnClick(lp.getLoginFrnt());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[6]/button")).click();

		Thread.sleep(2000);
//		b.btnClick(lp.getUpdatePro());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")).click();
		
		Thread.sleep(2000);
		
		Actions at = new Actions(driver);
		at.moveToElement(driver.findElement(By.xpath("(//span[text()='Edit'])[2]"))).perform();

		Thread.sleep(1000);
////		b.btnClick(lp.getEditBtn());
		driver.findElement(By.xpath("(//span[text()='Edit'])[2]")).click();
////		b.type(lp.getResHdField(), ".");
		driver.findElement(By.id("resumeHeadlineTxt")).sendKeys(".");
////		b.btnClick(lp.getSaveBtn());
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		WebElement response1 = driver.findElement(By.xpath("//div[@class='cnt']"));
		String rspn = response1.getText();
		WebElement update = driver.findElement(By.xpath("(//p[contains(text(),'Resume')])[1]"));
		String response = update.getText();
		
		Thread.sleep(2000);
		
//
		at.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).perform();
//		b.btnClick(driver.findElement(By.xpath("//div[text()='My Naukri']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//
		Thread.sleep(4000);
		b.closeBrowser(driver);
		System.out.println("Response -->"+rspn);
		System.out.println("Updation Successful-->"+response);
	}

}
