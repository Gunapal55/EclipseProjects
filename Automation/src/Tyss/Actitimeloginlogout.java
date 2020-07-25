package Tyss;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeloginlogout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		}
		public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		//enter the username in username textbox
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter the password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Implict wait function which will wait untill the loading of the page is done

		//After loading of the page logout button is clicked 
		driver.findElement(By.id("logoutLink")).click();
		//System.out.println("TestCase Pass");
		//closing the browser
		driver.quit();
}
}