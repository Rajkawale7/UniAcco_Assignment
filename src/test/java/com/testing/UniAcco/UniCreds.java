package com.testing.UniAcco;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UniCreds {
	static WebDriver driver = null; 
	
	@Test
	public void loginPage() {
		
		//launching chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open the Url
		driver.get("https://unicreds.com/contact-us");
		driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), "Contact Us | UniCreds");
		//Checking for alerts
		//Alert alert = driver.switchTo().alert();
		
		//Capturing the alerts text is present or not
		//String alertTexts = driver.switchTo().alert().getText();
		driver.quit();
	}
}
