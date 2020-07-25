package com.equals;

public class MM {

	public static void main(String[] args) {
		
		Student s1 = new Student("ABC",123,"8th A");
		Student s2 = new Student("ABC",123,"8t h A");
		System.out.println(s2.equals(s1));
	}
	
}
