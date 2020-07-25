package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taginactitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
					String tagname = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println("Tag name of Login button is "+tagname);
		driver.quit();
	}
}
