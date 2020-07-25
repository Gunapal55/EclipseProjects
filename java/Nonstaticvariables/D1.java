package com.Nonstaticvariables;

class D {
int i = 10;
boolean b;
}
class maincalss {
	public static void main(String[] args) {
	
	D obj1 = new D();

	System.out.println(obj1);
	System.out.println(obj1.i);
	System.out.println(obj1.b);
	
	D obj2 = new D();
	
	System.out.println(obj2.i);
	System.out.println(obj2.b);
	obj2.i = 20;
	obj2.b = true;
	
	D obj3 = new D();
	
	obj3.i = 30;

	obj3.b = false;
	
	System.out.println(obj3.i);

	System.out.println(obj3.i);

	
	
	}

}
