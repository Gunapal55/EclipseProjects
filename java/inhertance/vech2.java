package com.inhertance;

public class vech2 {// by default it extends to object class i.e. super most class.
	int mil;
	int speed;
	String color;
	
	vech2(String color,int mil, int speed)
	{
		this.speed = speed;
		this.color = color;
		this.mil = mil;
	}
	void moves()
	{
		System.out.println("vechile is moves");
	}
	}
