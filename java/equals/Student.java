package com.equals;

public class Student {
	String name;
	int id;
	String std;
	public Student(String name, int id,String std) {
		super();
		this.name = name;
		this.id = id;
		this.std = std;
	}
	public boolean equals(Object ob){
		Student s1 = (Student)ob;
		return this.name.equals(s1.name)&&
		this.id==( s1.id)&& this.std.equals(s1.std);
		
	}

}
