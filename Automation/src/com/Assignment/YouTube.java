package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("	https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("style-scope ytd-mini-guide-renderer'][2]")).click();
	driver.findElement(By.id("search")).sendKeys("Java");
		}
}
