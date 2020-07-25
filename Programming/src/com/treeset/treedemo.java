package com.treeset;

import java.util.TreeSet;

public class treedemo {
public static void main(String[] args) {
	TreeSet<Integer> s = new TreeSet<>(); //--> to avoid exception we need to add generic to store only homogeneous type of data
	System.out.println(s.isEmpty());
	s.add(10);
//	s.add("hello");--> If we store heterogeneous object in a treeset then the treeset fails to sort and store them and we get class_cast exception
	s.add(11);
	s.add(20);	
//	System.out.println(s.add(20));--> false duplicates are not allowed 
//	s.add(null); --> Doesn't allow null if we do so we will get null_pointer_execption
System.out.println(s);//--> order of insertion is not maintained but objects are stored in sorted order



}
}
