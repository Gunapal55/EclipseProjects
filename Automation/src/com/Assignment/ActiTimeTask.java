package com.Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTask {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			    }
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
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
		Thread.sleep(3000);
		driver.findElement(By.id("addTaskButtonId")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='- Select Customer -']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='- New Customer -']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("Prime Videos");
		driver.findElement(By.xpath("/html/body/div[29]/div/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input")).sendKeys("Project Name");
		
		
		//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	//	Thread.sleep(2000);
	//	driver.quit();
		
	}

}
