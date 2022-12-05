package com.kkem.firstauto;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {
	
	public static void main(String[]args)
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 
	}

}
