package com.elf.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	/**
	 * WedDriver common library
	 * @author gunapal
	 *
	 */
	
		/**
		 * wait for element present in GUI
		 * @param driver
		 */
	public void waitForPageToLoad(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * wait for element present in GUI-explicit wait
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @throws InterruptedException 
	 */
	public void waitForElementInGUI(WebDriver driver,WebElement element) throws InterruptedException {
	int count=0;
	while(count<=20) {
		try {
			element.isEnabled();
			break;
		}
		catch(Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}
	}
	/**
	 * select the value from the dropdown based on text
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * select the value from the dropdown based on index
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
}
