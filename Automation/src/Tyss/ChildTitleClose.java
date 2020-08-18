package Tyss;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTitleClose {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
	     Set<String> win = driver.getWindowHandles();		
		for(String wh:win){
			String name = driver.switchTo().window(wh).getTitle();
			System.out.println("Title of Child window is  "+name);
			driver.close();
		}
		}
}
