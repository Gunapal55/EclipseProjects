package com.multilevel;

public class A {
	int i =10;

}
class B extends A
{
	int j=20;
}
class C extends B
{
	int k =30;
}

class mainclasss
{
	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B();
		C ob3 = new C();
		
		System.out.println(ob1.i);
		System.out.println(ob2.j);
		System.out.println(ob3.i);
		System.out.println(ob3.i);
		System.out.println(ob3.j);
		System.out.println(ob3.k);
		
		
	}
}