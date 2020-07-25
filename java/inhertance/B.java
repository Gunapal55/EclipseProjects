package com.inhertance;

public class B extends A {
	int b =20;
 
	public static void main(String[] args) {
		
		A ob1 = new A();
		B ob2 = new B();
		System.out.println(ob1.a);
		System.out.println(ob2.a);
	//	System.out.println(ob1.b);CTE cannot access child properties with parent object
		System.out.println(ob2.b);

	}
}