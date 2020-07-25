package com.Nonstaticblock;

public class A 
{{
	System.out.println("from IIb-1");
}
	public static void main(String[] args) {
		 A ob1 = new A();
		 A ob2 = new A();
	}
	{
		System.out.println("from IIb-2");
}
	}
