package com.kkem.firstauto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {

		
	        //implicitWait( );
	       explicitWait( );
	       
	       
	    }



	    private static void explicitWait() {
	    	
	    	 System.setProperty("webdriver.chrome.driver", "D:\\projects\\firstautomation\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver( );
	        driver.get("https://google.com/ncr");
	        driver.findElement(By.name("q")).sendKeys("scrolltest" + Keys.ENTER);

	         
	       
	        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until
	        		(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      
	        System.out.println(firstResult.getText( )); 

	    }

	    private static void implicitWait() {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://reqres.in/api/users?delay=9");
	        System.out.println(driver.getPageSource());
	    }


		
	}


