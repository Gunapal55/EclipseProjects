package com.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTripBngtoGoa {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
	   driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("From")).sendKeys("Banglore");
		driver.findElement(By.id("To")).sendKeys("Goa");
		driver.findElement(By.className("depart_date keyValue span span24 required hasDatepicker")).click();
		driver.findElement(By.className("ui-state-default ui-state-active ")).click();
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
}
}