package Tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericlinkcapprog {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
		WebElement Link = allLinks.get(i);
		String Text = Link.getText();
		System.out.println(Text);
		}
		driver.close();
		}
		
}
