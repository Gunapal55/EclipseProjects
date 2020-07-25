package com.Exception;

public class NPE1 {
public static void main(String[] args) {
	System.out.println("main statrs");
	A ob = null; 
	System.out.println(ob);
	try{
		System.out.println(ob.i);
	}
catch(NullPointerException e)
	{
	System.out.println("object cannot be null");
	e.printStackTrace();//it helps us to find the line of exception 
	}
System.out.println("main ends");
}
}
