package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogosymbole {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean logo = driver.findElement(By.className("atProductName")).isDisplayed();
		boolean timerlogo = driver.findElement(By.className("atLogoImg")).isDisplayed();
		if(logo==true && timerlogo) {
		System.out.println("logo and timer is displayed and pass");
		}
		else {
		System.out.println("logo and timer is not displayed so failed");
		}
		driver.quit();
		}
		
}
