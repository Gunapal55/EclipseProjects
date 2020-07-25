package Tyss;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			    }
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shwetha/Desktop/Class/Demo.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		WebElement Link = allLinks.get(0);
		String Text = Link.getText();
		System.out.println(Text);
		driver.close();
		}	
}
