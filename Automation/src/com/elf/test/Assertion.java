package com.elf.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		@Test
		public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		if(ActualTitle.equals("Soogle")) {
		Reporter.log("pass",true);
		}
		else {
		Reporter.log("fail",true);
		}
		driver.close();
		}
		
}
