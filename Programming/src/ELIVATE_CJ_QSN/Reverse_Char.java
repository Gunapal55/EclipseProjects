package ELIVATE_CJ_QSN;

import java.util.Scanner;

public class Reverse_Char {
	public static void main(String[] args) {
		  String org,rev=""; // here i'm decalring both strings
		  Scanner sc = new Scanner(System.in); // user input
		  System.out.println("Enter your String ");
		  org = sc.nextLine(); // when user enters the string it will be stored in the org variable
		  for (int i = org.length()-1;i>=0;i--) { // for loop in a reverse order to fetch the value based on index
			rev = rev+org.charAt(i); // Based on the index it is fetching the char in it and storing it in the rev variable
		}
		  System.out.println("reverse of the given string is "+rev); //o/p of my rev logic will be dispalyed
}
}