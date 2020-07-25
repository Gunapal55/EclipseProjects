package com.upcasting;

public class showas {

	public void show(A x)//in order to access always need to be a parent type of data i.e. A type
	{
		System.out.println(x.i);//While sending it needs to be up-casted 
	//	System.out.println(x.j); 1st always needs to be up-casted then down-casting is done
	//	System.out.println(x.k);in-order to do this need to perform down-casting
		System.out.println(x.i);

	}
}
 