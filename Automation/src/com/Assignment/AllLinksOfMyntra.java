package com.Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfMyntra {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	List<WebElement> alllinks = driver.findElements(By.linkText("href"));
	int count = alllinks.size();
	System.out.println(count);
/*	for(int i=0;i<count;i++){
		WebElement link = alllinks.get(i);
		String text = link.getAttribute("href");
		System.out.println(text);	
	}
	driver.quit();*/
}
}
