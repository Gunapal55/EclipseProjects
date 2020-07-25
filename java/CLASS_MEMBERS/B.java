package com.CLASS_MEMBERS;

public class B{
	
	static int i =10;

static 
{
	
	int i=20;
	System.out.println(i);
	System.out.println(B.i);
}


public static void main(String[] args) {
	{
		System.out.println(i);
	}
}
}
