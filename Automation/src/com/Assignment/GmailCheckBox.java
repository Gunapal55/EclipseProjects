package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCheckBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   driver.findElement(By.id("identifierId")).sendKeys("shankgowda15@gmail.com");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   
	   
	   
	   
}
}