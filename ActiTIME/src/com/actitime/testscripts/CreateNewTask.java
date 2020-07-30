package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.EnterTimeTrackPage;

public class CreateNewTask extends BaseClass {
@Test
public void createNewTask() throws InterruptedException, EncryptedDocumentException, IOException{
	String ExpectedTitle = f.getExcelData("CreateTask",1, 2);
		String name = f.getExcelData("CreateTask", 1,0);
			String domain = f.getExcelData("CreateTask", 1, 1);
			String task = f.getExcelData("CreateTask",1, 2);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.getNewButton().click();
	Thread.sleep(3000);
	e.getSelectItemDD().click();
	e.getNewCustomer().click();
	e.getEnterCustomerName().sendKeys(name);
	e.getEnterProjectName().sendKeys(domain);
	Thread.sleep(3000);
	e.getEnterTaskName().sendKeys(task);
	e.getCreateTaskButton().click();
	Thread.sleep(3000);
//	String ActualCustomerCreated = e.VerifyTask().getText();
	//Assert.assertEquals(ActualCustomerCreated, ExpectedTitle);
	Thread.sleep(3000);
}
}
