package com.actitime.testscripts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseClass;
import com.actitime.generics.ListnerImplementation;
import com.actitime.objectrepository.EnterTimeTrackPage;
import com.actitime.objectrepository.TaskListPage;

@Listeners(ListnerImplementation.class)
	public class CreateCustomer extends BaseClass{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String ExpectedcustomerName = f.getExcelData("CreateCustomer", 1, 0);
		String customerdescription = f.getExcelData("CreateCustomer", 1, 1);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//Click on Task Tab
		e.getTasksTab().click();
		Thread.sleep(5000);
		TaskListPage t=new TaskListPage(driver);
		//Click on Add New Button
		Thread.sleep(5000);
		t.getAddNewBtn().click();
		//select New Customer in the Menu
		Thread.sleep(5000);
		t.getNewCustomerMenu().click();
		//Enter the customer Name
		Thread.sleep(5000);
		t.getEnterCustomerNametbx().sendKeys(ExpectedcustomerName);
		//Enter the Customer Description
		t.getCustomerDescriptiontbx().sendKeys(customerdescription);
		//Click on Select Customer DropDown
		Thread.sleep(5000);
		t.getCopyProjectDropDown().click();
		//Select our company in the drop drown
		t.getOurCompanyMenu().click();
		//Click on Create Customer button
		t.getCreateCustomerBtn().click();
		//Verify the Customer is successfully create or not
		Thread.sleep(5000);
		String ActualCustomerCreated = t.getVerifyCustomerText().getText();
		Assert.assertEquals(ActualCustomerCreated, ExpectedcustomerName);
		}
	}
