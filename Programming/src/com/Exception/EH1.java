package com.Exception;

public class EH1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		System.out.println("Main Strats");
	try{
		c=a/b;
		System.out.println(c);	

		}
	catch(ArithmeticException e){
			System.out.println("ArithmeticException in try block & handled ");
		
		}
		System.out.println(a+b);
		System.out.println("Main ends");
	}
	
}
