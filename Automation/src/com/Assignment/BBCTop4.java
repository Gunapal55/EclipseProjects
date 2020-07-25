package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCTop4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		String news1 = driver.findElement(By.xpath("//li[@class='top-list-item top-list-item__1 top-list-item--ranked top-list-item--odd']")).getText();
		String news2 = driver.findElement(By.xpath("//li[@class='top-list-item top-list-item__2 top-list-item--ranked top-list-item--even']")).getText();
		String news3 = driver.findElement(By.xpath("//li[@class='top-list-item top-list-item__3 top-list-item--ranked top-list-item--odd']")).getText();
		String news4 = driver.findElement(By.xpath("//li[@class='top-list-item top-list-item__4 top-list-item--ranked top-list-item--even']")).getText();
		System.out.println(news1);
		System.out.println(news2);
		System.out.println(news3);
		System.out.println(news4);		
		driver.quit();
		
	 }
 }