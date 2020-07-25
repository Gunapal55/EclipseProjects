package HandlingDisabledElementAndScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bbc.com/");
			Thread.sleep(5000);
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0,5000)");
			}

}