package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class color {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.opensourcebilling.org/");
			String color = driver.findElement(By.id("user_login_btn")).getCssValue("color");
			System.out.println(color);
			driver.close();
			}
			}
