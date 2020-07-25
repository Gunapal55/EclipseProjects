package com.abstractclass;

public class Circle extends Shape {
	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}
	public void area()
	{	
		double area = 3.14*r*r;
		System.out.println("Area of circle is "+area);
	}

}
