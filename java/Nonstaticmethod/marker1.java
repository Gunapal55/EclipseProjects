package com.Nonstaticmethod;

class marker1 {
	String color;
	int length;
}
class reynolds
{
	public static void main(String[] args) 
	{
		
		marker1 m1 = new marker1();
		m1.length = 12;
		m1.color = "red";
		
		marker1 m2 = new marker1();
		m2.length = 10;
		m2.color = "black";
		
		marker1 m3 = new marker1();
		m3.length = 15;
		m3.color = "blue";
		
		System.out.println(m1.length);
		System.out.println(m1.color);
		System.out.println(m2.length);
		System.out.println(m2.color);
		System.out.println(m3.length);
		System.out.println(m3.color);

		
	}

}
