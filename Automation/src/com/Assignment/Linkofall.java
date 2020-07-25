package com.Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkofall {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 System.out.println("enter the URL");
		 Scanner sc=new Scanner(System.in);
		 String s= sc.nextLine();
		   driver.get(s);
		   List<WebElement> l= driver.findElements(By.xpath("//a"));
		   int count=l.size();
		   System.out.println(count);
		   for(int i=0;i<count-1;i++) {
		   WebElement link=l.get(i);
		   String s1=link.getText();
		   System.out.println(s1);
		   }
		   driver.close();
	}

}
