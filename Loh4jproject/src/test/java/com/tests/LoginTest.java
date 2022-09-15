package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;


public class LoginTest extends BaseClass {
	//public static WebDriver driver;
	@Test(priority=1)
	public void LoginPageTest() throws InterruptedException {
		test=extent.createTest("LoginPageTest");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nilesh.dhale+33333@kilowott.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Nilesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(9000);
		
	}@Test
	public void loginVerification() {
		test=extent.createTest("LoginPageVerificationTest");
		Assert.assertTrue(false);
	}
	
	
	
	
	

}
