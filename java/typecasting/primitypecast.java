package com.typecasting;

public class primitypecast {
	public static void main(String[] args) 
	{
		
		
		
		double a = 65.9;
		double b = 65.01;
		char  x = (char)a;
		System.out.println(x);
		
		char y = (char)b;
		System.out.println(y);
		
		// Huge chance of loss of data i.e. 65.9 = 65 due to narrowing i.e. why narrowing isn't automatic 
	}

}
