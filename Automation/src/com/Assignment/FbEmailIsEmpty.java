package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbEmailIsEmpty {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String s1 = driver.findElement(By.id("email")).getAttribute("value");
		 System.out.println(s1);
		if(s1.isEmpty()){
			System.out.println("EmailId textbox is empty Testcase is pass");
		}
		else{
			System.out.println("EmailId textboc is Not empty Testcase is failed");
		}
	
	driver.quit();	
		
	}
}
