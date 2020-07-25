package com.Nonstaticmethod;

public class demo3 {
int a =10;
boolean b ;
void test()
{
	int c = 20;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(this.a);
	System.out.println(this.b);
	
}
public static void main(String[] args)
{
	demo3 ob1 = new demo3();

	System.out.println(ob1.a);
	System.out.println(ob1.b);
	//System.out.println(ob1.c); CTE since C is defined locally to test()
	ob1.test();
	
}
}
