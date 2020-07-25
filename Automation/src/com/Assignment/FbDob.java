package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDob {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement DayListBox = driver.findElement(By.id("day"));
		Select sd=new Select(DayListBox);
		
		WebElement MonthListBox = driver.findElement(By.id("month"));
		Select sm=new Select(MonthListBox);
		
		WebElement YearListBox = driver.findElement(By.id("year"));
		Select sy=new Select(YearListBox);
		
		sd.selectByIndex(8);
		Thread.sleep(2000);
		sm.selectByValue("2");
		Thread.sleep(3000);
		sy.selectByVisibleText("1997");
		Thread.sleep(3000);
	
		driver.quit();
	
	}
}
