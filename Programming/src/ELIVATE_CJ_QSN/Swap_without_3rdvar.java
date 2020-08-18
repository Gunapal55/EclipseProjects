package ELIVATE_CJ_QSN;

import java.util.Scanner;

public class Swap_without_3rdvar
{
public static void main(String[] args)
{ double a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value A");
a = sc.nextDouble();
System.out.println("Enter the value of B");
b = sc.nextDouble();
	System.out.println("orginal a "+a);
	System.out.println("orginal b "+b);
	b = a+b;
	a= b-a;
	b = b-a;
	System.out.println("Swapped a "+a);
	System.out.println("Swapped b "+b);
}
}
