package com.Nonstaticmethod;

public class demo4 {
	
	int a =10;
	
	void test()
	{
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		
		demo4 d1= new demo4();
		d1.test();
		System.out.println(d1.a);
	}
	
	
}
