package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		}
		public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/");
		//enter the username in username textbox
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		//close the browser
		driver.close();
		}
		}

