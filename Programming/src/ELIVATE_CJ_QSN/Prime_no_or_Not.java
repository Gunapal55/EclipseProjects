package ELIVATE_CJ_QSN;

import java.util.Scanner;

public class Prime_no_or_Not {
public static void main(String[] args) {
	int count =0;
	Scanner sc = new Scanner(System.in); //6
	System.out.println("Enter your number");
	int no = sc.nextInt(); //--> no=6;
	for(int i=2;i<=no/2;i++){ // 2 <3
		if(no%i==0){// 6/20-->3 & 6/3-->2
			count++;// count=0--> 1, 2
		}
	}if(count==0){ //count=0 since my count is not =0 
	System.out.println("Given number is prime "+no);	
	}
	else{
		System.out.println("Not a prime number");
	}
	
}
}