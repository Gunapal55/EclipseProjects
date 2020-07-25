package com.typecast;

public class ANYTYPE {
	
	public static void show(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		show('x');//widening
		//show(12.23);//narrowing not happening automatically
		show((int)10.23);

	}

}
