package com.MethodOverloading;

public class Sumofnum {
	
	static void sumof(double a, double b)
	{
		double res = a+b;
		System.out.println("sum of "+a+ " and "+b+ " is "+res);
	}
	static void sumof(double a, double b,  double c	)
	{
		double res = a+b+c;
		System.out.println("sum of "+a+ " , "+b+", "+c+ " is "+res);
	}
	static void sumof(double a, double b,  double c,  double d)
	{
		double res = a+b+c+d;
		System.out.println("sum of "+a+ " , "+b+", "+c+ " and "+d+ " is "+res);
	}
	
	public static void main(String[] args) {
		sumof(12.45,123.44,23);
		sumof(15.78,23.77);
		sumof(10,12,14,23);
		sumof(1,20,-12);
	}

}
