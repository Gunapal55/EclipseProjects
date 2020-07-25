package Tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/GUNAPAL%20P/Desktop/Hotel.html");
		WebElement SLVListBox = driver.findElement(By.id("slv"));
		Select s=new Select(SLVListBox);
		List<WebElement> AllSoption = s.getAllSelectedOptions();
		for(int i=0;i<AllSoption.size();i++) {
		WebElement option = AllSoption.get(i);
		String text = option.getText();
		System.out.println(text);
		}
		driver.close();
		}
		
}
