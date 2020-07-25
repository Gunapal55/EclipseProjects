package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMaleRadioButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		String r = "2";//isSelected
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String r1 = driver.findElement(By.id("u_0_7")).getAttribute("value");
		
		if(r.equals(r1)){
			System.out.println("Male radio button is not checked TestCase Pass");
		}else{
			System.out.println("Male radio button is checked TestCase Failed");
		}
		
		driver.quit();
	}

}
