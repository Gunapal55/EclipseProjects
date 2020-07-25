package com.Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Wipro jobs");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//body[@class='hp vasq']")).click();
	   Thread.sleep(3000);
	   	List<WebElement> links = driver.findElements(By.tagName("a")); //fetching w.r.t to tag name 
	   	int count = links.size(); //total number of links 
	   	System.out.println(count);
	   	for(WebElement dis:links){  //Advance for loop
	   		String pr = dis.getAttribute("href"); // fetching the value of href i.e. link
	   		System.out.println(pr); // printing all the links in the console
	   	}  
   }
}
