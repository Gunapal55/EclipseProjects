package com.Assignment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserClose {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> allwin = driver.getWindowHandles();
	for(String wh:allwin){
		driver.switchTo().window(wh);
		String actualtitle = driver.getTitle();
		if(actualtitle.equalsIgnoreCase("Amazon")){
			driver.close();
		}

	}
}
}
