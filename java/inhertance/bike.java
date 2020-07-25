package com.inhertance;

public class bike {
	String color;
	int speed;
	double mil;
	
	engine e =new engine(4,325);
	bike(String color,int speed, double mil)
	{
		this.color = color;
		this.speed = speed;
		this.mil = mil;
	}
	
}
