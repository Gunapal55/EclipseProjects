package com.MethodOverloading;

public class Demo01 {
	static void m1()
	{
		System.out.println("hello");
	}
	static int m1(int n)
	{
		System.out.println(n);
		return n;
	}
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		m1(12);
		m1();

	}

}
