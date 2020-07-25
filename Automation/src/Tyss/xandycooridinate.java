package Tyss;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class xandycooridinate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	public static void main(String[] args) {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/");
		Point login = driver.findElement(By.xpath("//div[text()='Login ']")).getLocation();
		int X = login.getX();
		int Y = login.getY();
		System.out.println("X = "+X);
		System.out.println("Y = "+Y);
		driver.close();
		}
		}

