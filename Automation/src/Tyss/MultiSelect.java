package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/GUNAPAL%20P/Desktop/Hotel.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrListBox);
		s.selectByIndex(0);

		s.selectByValue("v");

		s.selectByVisibleText("Dosa");

		s.deselectByIndex(1);

		s.deselectByValue("i");

		s.deselectByVisibleText("Vada");

		}
		
}
