package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Removevalue {
		static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		}
		public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		driver.findElement(By.id("email")).clear();
		}
}
