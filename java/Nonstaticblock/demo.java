package com.Nonstaticblock;

public class demo {
	{
		System.out.println("object getting created");
	}

public static void main(String[] args) {
		{
			demo d1 = new demo();
			demo d2 = new demo();
		}
	}
}