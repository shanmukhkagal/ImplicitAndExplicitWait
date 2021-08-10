package com.saleniumpommodel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleniumWaits {
	
	public static  void saleniumWaits() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\sts-4.5.1.RELEASE\\chromedriver_win32");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Setting the implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Golgumbaz");
		driver.findElement(By.name("btnK")).click();
		
		
		//Setting Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		    WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.name("zzz")));
		//driver.findElement(By.name("abcd")).click();
		
		driver.close();
		//driver.quit();
	}
	
	public static void main(String[] args) {
		saleniumWaits();
		
	}

}