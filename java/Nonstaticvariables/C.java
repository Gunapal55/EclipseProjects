package com.Nonstaticvariables;

public class C {
int x = 10; // non static variable

public static void main(String[] args) {
	
	C obj1 = new C();
	System.out.println(obj1.x);
	
	C obj2 = new C();
	System.out.println(obj2.x);
	
	obj1.x = 20;
	System.out.println(obj1.x);// 20
	System.out.println(obj2.x);// 10 Every time you create an object of the class new copy is made so chages is applied to only the object copy
}
}
