package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shwetha/Desktop/naukri.html");
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys("E:\\sandeep\\eclipse-workspace\\TYSS\\Automation\\data\\Resume.txt");//Absolute path of the local file becz  send keys only accepts absolute path

		}
}
