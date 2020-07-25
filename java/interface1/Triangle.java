package com.interface1;

public class Triangle implements Shape  {

	int b;
	int h;
	
	Triangle() {}
	
	public Triangle(int b, int h)
	{
		super();
		this.b = b;
		this.h = h;
		
	}
	
	public void area()
	{
		double area = 0.5*b*h;
		System.out.println("area of triangle is "+area);

		
		
	}
	
	
	
	
	
	
	
}
