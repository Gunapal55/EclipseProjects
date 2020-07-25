package com.Exception;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st number ");
	int a = sc.nextInt();
	System.out.println("Enter the 2nd number ");
	int b = sc.nextInt();
	try{
	int quotient = a/b;
	System.out.println("Quotient is "+quotient );
	}
	catch(ArithmeticException e)
	{ 
		System.out.println("Cannot divide it by 0");
	}
}
}