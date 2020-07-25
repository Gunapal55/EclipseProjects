package Tyss;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptionsnodupl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Shwetha/Desktop/Hotel.html");
		WebElement MtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrListBox);
		HashSet<String> alltext=new HashSet<String>();
		List<WebElement> allOption = s.getOptions();
		for(WebElement option:allOption) {
		String text = option.getText();
		if(alltext.add(text)==true) {
		System.out.println(text);
		}
		}
		driver.close();
		}
		
}
