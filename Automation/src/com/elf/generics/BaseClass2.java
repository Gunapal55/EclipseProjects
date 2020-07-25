package com.elf.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		}

		public WebDriver driver;
		@Parameters("browser")
		@BeforeTest
		public void openBrowser(String browser) {
		System.out.println("opening the browser");
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterTest
		public void closeBrowser() {
		System.out.println("close browser");
		driver.close();
		}
		@BeforeMethod
		public void login() throws IOException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("un");
		String pw = f.getPropertyData("pw");
		driver.get(url);
		System.out.println("Login");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		@AfterMethod
		public void logout() throws InterruptedException {
		System.out.println("logout");
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		}
		
}
