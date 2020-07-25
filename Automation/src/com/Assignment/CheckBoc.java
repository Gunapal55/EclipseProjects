package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
   public static void main(String[]args) throws InterruptedException
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	  boolean b= driver.findElement(By.id("keepLoggedInLabel")).isSelected();

	  if(b){
		  System.out.println("KeepmeLoggedIn checkbox is checked Testcase Fail");
	  }else{
		  System.out.println("KeepmeLoggedIn checkbox is Unchecked Testcase Pass");
	  }
	  
	  driver.quit();
   }
}
