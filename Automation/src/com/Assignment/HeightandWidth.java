package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidth {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    }
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
					Dimension untb = driver.findElement(By.id("username")).getSize();
					Dimension pwdtb = driver.findElement(By.name("pwd")).getSize();
				int unheight = untb.getHeight();
				int unwidth = untb.getWidth();
				int pwdheight = pwdtb.getHeight();
				int pwdwidth = pwdtb.getWidth();
				
				System.out.println("Height of UNTB is "+unheight+" Width of UNTB is  "+unwidth);
				System.out.println("Height of PWDTB is "+pwdheight+" Width of PWDTB is  "+pwdwidth);
	
	driver.quit();
}
}
