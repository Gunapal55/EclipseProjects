package com.constructor;

public class c1 {
	int i=10;
	boolean b = false;
	
	c1()
	{
		System.out.println("from c1");
		System.out.println(i);
		System.out.println(this);
		System.out.println(this.i);
		System.out.println(" END of c1");

	}
	c1(int a,boolean y)
	{
	
		System.out.println("from c1(int)");
		System.out.println(a);
		System.out.println(i);
		System.out.println(y);
		System.out.println(this);
		System.out.println(this.i);
		i = a;
		System.out.println(i);
		System.out.println(this.i);	
		System.out.println("END OF c1(int)");

	}
	
	public static void main(String[] args) {
		 c1 ob = new c1(100,true);
		 System.out.println(ob);
		 System.out.println(ob.i);
		 
		 c1 ob2 = new c1();
		 System.out.println(ob2);
		 System.out.println(ob2.i);
	}

}
