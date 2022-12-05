package com.kkem.firstauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AutomateTestNg {
    
	WebDriver driver;  //web driver is declared globally.It can be used by all the methods in the class.
	
	@BeforeSuite  //annotation used to do all the setup before test case execution.It is invoked before all methods.
	public void setup() {      //to setup the chrome driver
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
	}
	
	@BeforeMethod  //It will be invoked before each method
	public void login() {
		
		System.out.println("beforemethod");
	}
	
	@Test
	public void TC1() {
		
	   System.out.println("TC1");
		
	}
	
	@Test
	public void TC2() {
		
		System.out.println("TC2");
		
	}
	
	@Test
	public void TC3() {
		
		System.out.println("TC3");
		
	}
	
	@AfterMethod  //It will be invoked after each method
	public void logout(){
		
		
		System.out.println("aftermethod");
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit(); 
	}


}
