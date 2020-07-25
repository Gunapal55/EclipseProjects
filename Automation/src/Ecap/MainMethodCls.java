package Ecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			LoginPage l=new LoginPage(driver);
			driver.navigate().refresh();
			l.setLogin("admi2n","manager1");
			Thread.sleep(4000);
			
			}
			
}
