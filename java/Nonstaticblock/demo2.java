package com.Nonstaticblock;

public class demo2
{
	int i;
	{	System.out.println("from demo2");
}
	
	demo2(){
		System.out.println("from const UDNP");
	
	}
	demo2(int i)
	{
		this.i = i;
		System.out.println("from demo2 UDP(int0)");
	
		}
	
public static void main(String[] args) {
	demo2 ob1 = new demo2();
	System.out.println(ob1.i);
	
	demo2 ob2 = new demo2(12);
	System.out.println(ob2.i);
}
}

