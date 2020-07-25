package com.Nonstaticvariables;

public class B {
int i;
public static void main(String[] args) {
	
	B ob1 = new B();
	System.out.println(ob1.i);
	System.out.println(ob1);
	ob1.i = 20;
	
	System.out.println(ob1.i);
	}

}
