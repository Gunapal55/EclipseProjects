package com.Nonstaticmethod;

public class NSM1 {
	void m1()
	{
		System.out.println("from m1()");
	}
	
	public static void main(String[] args) {
	//	NSM1.m1();// calling static method not works non static
		NSM1 ob1 = new NSM1();
		
		ob1.m1();
		
		
	}

}
