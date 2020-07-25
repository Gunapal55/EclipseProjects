package com.derivedtypecasting;

public class main12 {
	
	class A{
		int i=11;
	}
	class B extends A{
		int j=22;
	}
	class C extends B{
		int k=33;
	}
}
	class main{
	public static void main(String[] args) 
{
	
	A ob = new B();
	B ob1 = new C();
	A ob3 = new C();
	System.out.println(ob.i);
	System.out.println(ob3.i);

	
	
	}
	}

	
	
