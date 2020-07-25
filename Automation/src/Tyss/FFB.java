package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFB {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
		{
				WebDriver driver = new FirefoxDriver(); 
				driver.get("https://www.google.com/");
				Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java");
			
		/*		driver.get("https://www.youtube.com/");
				Thread.sleep(3000);
			   driver.findElement(By.id("search")).sendKeys("Java Strings");
			*/   
		}
}
