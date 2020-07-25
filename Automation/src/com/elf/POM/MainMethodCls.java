package com.elf.POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage();
		PageFactory.initElements(driver, l);
		l.setLogin("admin", "manager");
		
	}
}
