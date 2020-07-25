package com.Exception;

import java.util.Scanner;

public class ARINOBEX {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int[] a = new int[5];
	System.out.println("Pls enter 5 numbers");
	 for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}

for (int i = 0; i <a.length; i++) {
	System.out.println(a[i]);
  }
System.out.println("enter the index from where you want to fetch the value"); 
int i = sc.nextInt();
try{
System.out.println("the value is "+a[i]);
}
catch (ArrayIndexOutOfBoundsException e){ 
	System.out.println("Pls enter the index less than 5");
	e.printStackTrace();
}
}
}
