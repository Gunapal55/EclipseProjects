package Tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeQuit {
	static{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www/gmail.com");
	Thread.sleep(2000);
	driver.quit();
}
}
