package com.Downcasting;

public class MC2 {
		
		public static void showdetls(A g)
		{
			System.out.println(g.i);
			if(g instanceof B)
			System.out.println(((B)g).j);
			if(g instanceof C)
			System.out.println(((C)g).k);
			System.out.println("---------------------");
		}
		
	public static void main(String[] args)
	{
		
		A ob1 = new A();
	//	showdetls(ob1);
		B ob2 = new B();
	//	showdetls(ob2);
		C ob3 = new C();
		showdetls(ob3);
		
	}

}
