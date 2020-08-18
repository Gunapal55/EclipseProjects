package Tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/");
		//enter the policy numb
		driver.findElement(By.id("policynumber")).sendKeys("123");
		//click on dob
		driver.findElement(By.id("dob")).click();
		//select the date
		WebElement MonthListBox = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(MonthListBox);
		s.selectByVisibleText("Dec");
		WebElement YearListbox = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(YearListbox);
		s1.selectByVisibleText("1995");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='11']")).click();
		//click on contact numb
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		//click on renew button
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		//close the browser
		driver.close();
		}
		
}
