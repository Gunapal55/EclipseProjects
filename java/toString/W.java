package com.toString;

public class W {
	
	public String toString() // Overriding toString() to return our own o/p
	{
		return ",,";
	}
	
	
	public static void main(String[] args) {
		
		W ob = new W();
		System.out.println(ob);//ob is reference by calling it toString() will extecute
	//in object class and gives ref address in String format.

		
		
	}
}
