package Patterns;

import java.util.Scanner;

public class Dyanmicinparry 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter start no");
		int start=sc.nextInt();
		System.out.println("enter end no");
		int end=sc.nextInt();
		int n=0;
		int[] arr=new int[end-start+1];
		for(int k=start;k<=end;k++)
		{
			int no=k;
		
			int fact=1;
			for(int i=no;i>=1;i--)
			{
				fact=fact*i;
			}
			arr[n]=fact;
			System.out.println(arr[n]);
			n++;		
		}
				
		
		
		
		
		
		
		
	}
	
	
	
}
