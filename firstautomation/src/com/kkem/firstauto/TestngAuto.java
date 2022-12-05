package com.kkem.firstauto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAuto {
	WebDriver driver;     //Defined at class-level to access the variable 'driver' in any method inside the class.Scope is now globally defined.
	
	
	@BeforeMethod
	public void setup()     //preconditions
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 //driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		
	}

	
	
	@AfterMethod         //post steps to close the browser once the test cases are done.
	public void teardown()
	{
		//driver.quit();
	}
	


}
