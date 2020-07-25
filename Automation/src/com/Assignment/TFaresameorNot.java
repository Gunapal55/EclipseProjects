package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TFaresameorNot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
						Point mntb = driver.findElement(By.id("u_0_r")).getLocation();
						int x = mntb.getX();
						Point pwdtb = driver.findElement(By.id("u_0_w")).getLocation();
						int x1= pwdtb.getX();
						
					if(x==x1){
						System.out.println("Testcase is pass");
					}else{
						System.out.println("Testcase is failed");		
					}
			System.out.println("X-coordinate of mobile number textbox is "+x);
			System.out.println("X-coordinate of password textbox is "+x1);
			
		driver.quit();
	}	
}
