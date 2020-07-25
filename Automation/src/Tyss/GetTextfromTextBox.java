package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextfromTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		String PasswordText = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(PasswordText);
		driver.quit();
		}
		
}
