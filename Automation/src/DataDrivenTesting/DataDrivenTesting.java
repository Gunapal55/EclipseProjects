package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws IOException {
		//get java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//create an object property class
         Properties p=new Properties();
       //load the file
         p.load(fis);
       //get the data(value) by passing the key
         String url = p.getProperty("url");    
         String un = p.getProperty("un");
         String pw = p.getProperty("pw");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.name("pwd")).sendKeys(pw);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
         
	}

}
