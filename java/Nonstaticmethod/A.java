package com.Nonstaticmethod;

public class A {
	int i;
	
	 int initilize(int a)
	 {
		 return i = a;
	 }
	
	public static void main(String[] args) {
		
		A r1 = new A();
		r1.initilize(123);
		r1.initilize(13243);
		r1.initilize(823);

		System.out.println(r1.i);
		
	}

}
