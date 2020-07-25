package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement MonthListBox = driver.findElement(By.id("month"));
		Select s=new Select(MonthListBox);
		Thread.sleep(2000);
		s.selectByVisibleText("Dec");
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(2000);
}
}