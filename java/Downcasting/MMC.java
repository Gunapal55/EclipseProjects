package com.Downcasting;
//If we are not upcasting and doing directly perform downcasting we will get classcast execption
public class MMC {
	public static void showdet(A x)
	{
		System.out.println(x.i);// A can only access i 
		if(x instanceof B)
		System.out.println(((B)x).j);// B can access both i and j CCE 
	//	System.out.println(((C)x).k);//C can access i, j and k.

		
	}
	public static void main(String[] args) 
	{
		A ob1 = new A();
	showdet(ob1);// exception oocured and got transfered 
		B ob2 = new B();
	//	showdet(ob2);
		C ob3 = new C();
	//	showdet(ob3);

		
		
		
		
	}
}
