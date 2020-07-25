package com.Polymorphism;

public class Circle extends Shape{
	
	int r;
	Circle()
	{ }
	public Circle(int r) {
		super();
		this.r = r;
	}
	public void area()
	{
		double area = 3.14*r*r;
		System.out.println("area of circle is "+area);
	}

}
