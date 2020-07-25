package com.toString;

public class A {
	int i;
	int j;
	A() { }
	A(int i, int j){
		this.i =i;
		this.j =j;
	} 
	@Override 
public String toString() //Overriding toString method to see the   
{
	return("i is "+i+" j is "+j);	
}
public static void main(String[] args) {
	
	
	A ob1 = new A(10,20);
	A ob2 = new A(20,30);
	A ob3 = new A(40,50);
	A ob4 = new A(50,60);
	
	System.out.println(ob1);
	System.out.println(ob2);
	System.out.println(ob3);
	System.out.println(ob4);
	
	/*
	System.out.println(ob1.i);
	System.out.println(ob1.j);
	System.out.println(ob2.i);
	System.out.println(ob2.j);
	System.out.println(ob3.i);
	System.out.println(ob3.j);
	System.out.println(ob4.i);
	System.out.println(ob4.j);
*/
	
	
	}

}
