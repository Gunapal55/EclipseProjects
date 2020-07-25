package com.pack2;

import com.pack1.A; //In order to access i we need to import package with the class

public class C {

	public static void main(String[] args) {
	/*	
		A ob2 = new A();//it's a default constructor it's always public we use the constructor without any error.
		System.out.println(ob2);
		System.out.println(A.i);
	}
*/
	}}
// We should change the visibility of i to public or we need to have getters and setters
//if the data is sensitive.