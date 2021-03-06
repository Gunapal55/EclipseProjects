package Tyss;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		@Test
		public void testScreenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot t=(TakesScreenshot) driver;
		//we can also use evenfiringwebdriver-->EventFiringWebDriver t=new EventFiringWebDriver(driver);
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/ss.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		}
		
}
