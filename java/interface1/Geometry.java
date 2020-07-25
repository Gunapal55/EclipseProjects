package com.interface1;

public class Geometry {

	public static void main(String[] args) {
		
		
		Shape s;
		
		Circle c= new Circle(2);
		c.area();
		
		s = new Circle(2);
		s.area();
		s = new Triangle(2,4);
		s.area();
		s = new Rectangle(4,6);
		s.area();
	}
	
	
	
	
	
	
}
