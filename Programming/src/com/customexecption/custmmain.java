package com.customexecption;
// call custom exception explicitly
public class custmmain {
public static void main(String[] args) throws InterruptedException {
	try 
	{
		throw new CustomExe("go away");
	} 
	catch (CustomExe e) 
	{	System.out.println(e);//Information about the exception occurred 
//		e.printStackTrace();
	
		Thread.sleep(3000);//it's a wait statement it will pause the execution it will accept mili-second as the argument 
		//thread is a class name and sleep is the static method which will pause the execution for given time
		
		System.out.println("Done");
	
	
	}
}
}
