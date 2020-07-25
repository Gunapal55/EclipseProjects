package com.toString;

public class Details {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Jack", 213,12.5);
		Employee e2 = new Employee("Jim", 214,12.5);
		Employee e3 = new Employee("Joe", 215,12.5);
		Employee e4 = new Employee("Jhon", 216,12.5);
		
		TE t1 = new TE("Ram",312,16.6,"Selenium");
		TE t2 = new TE("Sham",452,17.2,"Qtp");
		System.out.println(t1);
		System.out.println(t2);

		System.out.println(e1.name+" "+e1.id+" "+e1.salary);// or Override toString() i.e.
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);

		
		
	}
}
