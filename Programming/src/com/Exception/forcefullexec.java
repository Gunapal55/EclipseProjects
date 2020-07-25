package com.Exception;

import java.util.Scanner;

public class forcefullexec {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter your age");
	int voteage= Sc.nextInt();
	
	if(voteage>=18&&voteage<=122){
		System.out.println("can cast vote");
	}
	else
	{
		System.out.println("cannot cast vote");
		throw new ArithmeticException();
	}
}
}
