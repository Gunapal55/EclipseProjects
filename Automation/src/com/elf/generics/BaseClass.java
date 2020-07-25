        package com.elf.generics;
 import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public WebDriver driver;
		@BeforeClass
		public void openBrowser() {
		System.out.println("opening the browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@AfterClass
		public void closeBrowser() {
		System.out.println("close browser");
		driver.close();
		}
		@BeforeMethod
		public void login() throws EncryptedDocumentException, IOException 
		{
			System.out.println("Login");
			FileInputStream fis=new FileInputStream("./data/ActitimeData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String link = wb.getSheet("Actitime").getRow(0).getCell(1).getStringCellValue();
			String un = wb.getSheet("Actitime").getRow(1).getCell(1).getStringCellValue();
			String pwd = wb.getSheet("Actitime").getRow(2).getCell(1).getStringCellValue();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(link);
			driver.findElement(By.id("username")).sendKeys(un);	
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		}
		@AfterMethod
		public void logout() {
		System.out.println("logout");
		driver.findElement(By.id("logoutLink")).click();
		}  
}
