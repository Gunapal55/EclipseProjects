package HandlingDisabledElementAndScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DIsElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
  		driver.get("file:///C:/Users/GUNAPAL%20P/Desktop/TYS/Selenium/DisabledElement.html");
  		driver.findElement(By.id("t1")).sendKeys("admin");
  		JavascriptExecutor j=(JavascriptExecutor) driver;
  		//enter manager in pw disabled textbox
  		j.executeScript("document.getElementById('t2').value='manager'");
  		//click on Login Button using java script
  		j.executeScript("document.getElementById('t3').click()");

}
}