package com.kkem.firstauto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VwoWaits {

	
	public static void main(String[] args) {
		implicitwait();
		//explicitwait();

	}
	
	private static void implicitwait() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\projects\\firstautomation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("login-username"));
		un.sendKeys("abcd@gmail.com");
		
		WebElement w =  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(un));
		
		WebElement pw = driver.findElement(By.id("login-password"));
		pw.sendKeys("abc@143");
		WebElement w1 =  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(pw));
		
		WebElement signin = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
		signin.click();
		WebElement w2 =  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(signin));
		
	}
	
	
	
	


}
