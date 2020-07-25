package com.scanner;
import java.util.Scanner;
public class voter {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		if(age>=18&&age<=124){
			System.out.println("can vote");
		}else{
			System.out.println("Cannot vote");
		}
	}

}
