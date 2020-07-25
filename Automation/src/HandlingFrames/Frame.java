
package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("file:///C:/Users/GUNAPAL%20P/Desktop/TYS/Selenium/Page1.html");
		//switch the control to the frame by using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("d2")).sendKeys("jsp");
		//switch to parent of the frame (page 1.html) exit the frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("qsp");
		}
}
