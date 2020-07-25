
package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeVIdeo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=atv_nb_lcl_en_US?_encoding=UTF8&ext_vrnc=hi%7Cm_woIqHOSOc_c386629063406_s");
		driver.findElement(By.xpath("//span[text()='EN']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@value,'Espa')])[1]")).click();
		}
}
