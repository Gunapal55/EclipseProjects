package com.Polymorphism;

public class Geometry {

	public static void main(String[] args) 
	
	{
		
		Shape s1 = new Shape();
		
		Rectangle r1 = new Rectangle(10, 2);
		
		Circle c1 = new Circle(2);
		
		
		//Non-primitive array	
	
		Shape S1[] ={s1,r1,c1, new Circle(4),new Rectangle(10,1)};
		for(int i =0;i<S1.length;i++)
		{
		System.out.println(S1[i]);
		S1[i].area(); 
		System.out.println("--------------------------------------------");
		}
		
		
		
	}
	
	
}
