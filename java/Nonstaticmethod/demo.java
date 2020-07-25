package com.Nonstaticmethod;

public class demo {
	void test()
	{
		System.out.println("from test()");
		System.out.println(this);
		 }

	public static void main(String[] args) {
	 demo ob1 = new demo();
	 demo ob2 = new demo();
	 demo ob3 = new demo();
	 
	 System.out.println(ob1);
	 System.out.println(ob2);
	 System.out.println(ob3);
	
	 ob1.test();
	 ob2.test();
	 ob3.test();
	}

}
