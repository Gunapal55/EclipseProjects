package HandlingDisabledElementAndScrollBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		
		WebDriver  wd = new ChromeDriver();
  		wd.get("https://www.google.com/");
  		RemoteWebDriver dr = (RemoteWebDriver) wd;
  		dr.executeScript("alert('hi')");
		
		
		
		
	}
}
