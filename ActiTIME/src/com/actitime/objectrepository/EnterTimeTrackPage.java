package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
		
		@FindBy(id="logoutLink")
		private WebElement logout;
 
		@FindBy(xpath="//div[text()='Tasks']")
		private WebElement TasksTab;
		
		@FindBy(xpath ="//span[.='New']")
		private WebElement NewButton;
		
		@FindBy(xpath = " (//div[@class='selectedItem'])[5]")
		private WebElement SelectItemDD;
		
		@FindBy(xpath = "//div[.='- New Customer -']")
		private WebElement NewCustomer;
		
		@FindBy(xpath ="//input[@placeholder='Enter Customer Name']")
		private WebElement EnterCustomerName;
		
		@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
		private WebElement EnterPojectName;
		
		@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
		private WebElement EnterTaskName;
		
		@FindBy(xpath = "//div[.='Create Tasks']")
		private WebElement CreateTaskButton;
		
		@FindBy(xpath = "//div[.='Create Customer']")
		private WebElement VerifyTask;
		
		public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

		public void clickLogout() {
			 logout.click();
		}

		public WebElement getNewButton() {
			return NewButton;
		}

		public WebElement getSelectItemDD() {
			return SelectItemDD;
		}

		public WebElement getNewCustomer() {
			return NewCustomer;
		}

		public WebElement getEnterCustomerName() {
			return EnterCustomerName;
		}
		
		public WebElement getEnterProjectName() {
			return EnterPojectName;
		}
		
		public WebElement getEnterTaskName() {
			return EnterTaskName;
		}

		public WebElement getCreateTaskButton() {
			return CreateTaskButton;
		}

		public WebElement getTasksTab() {
			return TasksTab;
		}
		public WebElement VerifyTask() {
			return VerifyTask;
		}
}	
		