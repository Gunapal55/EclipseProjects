package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextIsPresent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		String Expected_value ="demo@opensourcebilling.org";
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/users/sign_in");
	 String val = driver.findElement(By.id("email")).getAttribute("value");
	   System.out.println(Expected_value);
		System.out.println(val);
	 if(val.equals(Expected_value )){
		 System.out.println("TestCase Pass");
	 }else{
		 System.out.println("TestCase Failed");
	 }
		driver.quit();
	}
}
