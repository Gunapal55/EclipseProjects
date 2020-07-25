package com.loops;

public class continue1 {

	public static void main(String[] args) 
	{
			int n1=1;
			int n2 =40;
			int n3 = 3;
			for(int i=n1;i<=n2;i++)
			{
				if(i%n3==0)
				continue; // this statement will skip the multiples of n3 and print the rest of the numbers
				System.out.println(i);
					
			}

	}

}
