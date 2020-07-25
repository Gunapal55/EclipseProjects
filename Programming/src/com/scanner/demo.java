 package com.scanner;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String	n =s.next();
	
	System.out.println("Enter your age");
	int a=s.nextInt();

	System.out.println("User name is "+n+" and age is "+a);
	
	}
}