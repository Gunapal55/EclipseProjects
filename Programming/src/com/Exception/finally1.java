package com.Exception;

import java.util.Scanner;

public class finally1 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,45,6};
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Enter your 1st input");
			int a = sc.nextInt();
			System.out.println("Enter your 2nd input");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Quoitent is : "+c);
			System.out.println("enter index value");
			int i=sc.nextInt();
					System.out.println(arr[i]);
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Entered index value is not present");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Please do not assgin 2nd input as 0");
//		}
//	catch(Throwable e){ //it will  extend every exception so keep it at last
//		System.out.println("Error!!..");
//		//e.printStackTrace();
//	}
		
	finally{//--> Regardless of exception occurred or not or handled or not finally block will execute.
		System.out.println("It's finally closing scanner....");
		sc.close();//--> to close the scanner input
	}
		System.out.println("Thank you");
		
	}
}
