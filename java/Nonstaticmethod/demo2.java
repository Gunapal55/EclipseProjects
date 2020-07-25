package com.Nonstaticmethod;

public class demo2 {

	int a = 10;
	
	void test(){
		System.out.println("in test()");
		System.out.println(a);
		System.out.println(this.a);

	}
	public static void main(String[] args) 
	{
		demo2 d1 = new demo2();
		demo2 d2 = new demo2();
		
		System.out.println(d1.a);
		d1.a = 20;
		d1.test();
		
		System.out.println(d2.a);
		d2.a = 30;
		d2.test();
	}
}
