package com.abstractclass;

public class Rectangle extends Shape{

		int l;
		int b;
	
	public	Rectangle(int l, int b)
		{
			super();
			this.l= l;
			this.b =b;
		}
		void area()
		{
			int area = l*b;
		System.out.println("Area of rectangle is "+area);
		
	}
	}
