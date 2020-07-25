package Tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugge {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		WebDriver driver=new ChromeDriver();
		//Go to www.google.com
		driver.get("https://www.google.com/");
		//Type java in search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		//Find all the auto suggestions and print the count
		List<WebElement> allautosugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allautosugg.size();
		System.out.println(count);
		for(WebElement Autosugg:allautosugg) {
		String text = Autosugg.getText();
		System.out.println(text);
		}
		allautosugg.get(0).click();
		}
}
