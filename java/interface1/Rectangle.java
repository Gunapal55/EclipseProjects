package com.interface1;

public class Rectangle implements Shape {
	int l;
	int b;
	Rectangle() { }
	public Rectangle(int l, int b)
	{
		super();
		this.l= l;
		this.b =b;
	}
	
	public void area()
	{
		int area = l*b;
		System.out.println("area of rectangle is "+area);
	}
	

}
