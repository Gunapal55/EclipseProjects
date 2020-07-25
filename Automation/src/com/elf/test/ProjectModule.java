package com.elf.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=1,invocationCount=2)
	public void createProject()
	{
	Reporter.log("CreateProject",true);
	}
	@Test(priority=2,dependsOnMethods="createProject")
	public void modifyProject()
	{
	Reporter.log("ModifyProject",true);
	}
	@Test(priority=3,enabled=true)
	public void deleteProject()
	{
	Reporter.log("DeleteProject",true);
	}
	
}
