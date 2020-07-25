package com.elf.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		@Test
		public void testVerifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(ActualTitle, "Google");
		driver.close();
		s.assertAll();
		}
		
}
