package com.upcasting;

public class maincls {
	public static void main(String[] args) {
		
		
		A ob1 = null;
		ob1 =(A) new B();//class operator not mandatory  UP
		
		System.out.println(ob1.i);
		B ob2 = new C();//UP
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3 = new C();
		 
		System.out.println(ob3.i);
	//	System.out.println(ob3.j);
	//	System.out.println(ob3.k);

		
	}

}
