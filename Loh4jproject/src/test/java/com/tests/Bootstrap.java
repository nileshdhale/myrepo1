package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		List <WebElement> options=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		
          for(WebElement ele:options) {
        	String value=    ele.getText();
        	  
        	  System.out.println(value);
        	  
        	  if(value.equalsIgnoreCase("home")) {
        		  ele.click();
        		  System.out.println("clicked on home");
        		  break;
        	  }
          }
	}

}
