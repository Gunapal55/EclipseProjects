package com.hashcode;

public class A {
	int i;
	
	public A(int i) {
		super();
		this.i = i;
	}
	
	@Override
public boolean equals(Object ob){
	return this.i ==((A)ob).i;
}

@Override
public int hashCode() {
	
	return i;
	
}
	public static void main(String[] args) {
		A ob1 = new A(10);
		A ob2 = new A(10);
		A ob3 =new A(100);
		B ob4 = new B(12, 12);
		B ob5 = new B(12, 12);
	//	int i = ob1.hashCode();//it returns object value in number format
	// System.out.println(i);	
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob1.equals(ob3));
		System.out.println(ob1.hashCode());
		System.out.println(ob3.hashCode());
		System.out.println("------------------------- ------------");
		System.out.println(ob4.equals(ob5));
		System.out.println(ob4.hashCode());
		System.out.println(ob5.hashCode());
	}
}
