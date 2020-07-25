package com.Nonstaticvariables;

 class A{
public static void main(String[] args) {
	System.out.println("main starts");

	A obj = new A();
	System.out.println(obj);//A@23

System.out.println(new A());
//new keyword creates new object every-time its used

}
}
