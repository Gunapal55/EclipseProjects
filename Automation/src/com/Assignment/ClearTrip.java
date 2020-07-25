package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cleartrip.com/");
			
			driver.findElement(By.id("FromTag")).sendKeys("Ban");
			Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.className("list"));
		Thread.sleep(5000);
			 	int count = autosugg.size();
			 	System.out.println(count);
			 	for(WebElement sugg:autosugg){
			 			String text = sugg.getText();
			 			System.out.println(text);
			 	}
					
	}
}
