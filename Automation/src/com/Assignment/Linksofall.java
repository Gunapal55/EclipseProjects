package com.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksofall {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException {
			
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.com/");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				List<WebElement> l = driver.findElements(By.xpath("//input[@type='text' and @value='iphone ']"));
				int count=l.size();
				System.out.println("total links="+count);
				for(WebElement e:l) {
					String link=e.getText();
					System.out.println(link);
				}
				l.get(count).click();
			}


}
