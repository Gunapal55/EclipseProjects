package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class A {
public static void main(String[] args) {
	 
	 ArrayList<String> al = new ArrayList<>();
	 al.add("Alpha");
	 al.add("gama");
	 al.add("beta");
	 al.add("zeus");
	 al.add("tango");
	 al.add("bangoo");
	 al.add("1012");
	 al.add("*&^");
	 al.add("1");
	 al.add("12");
	 al.add("11");
	 al.add("10");
	 al.add("15");
	 al.add("123");
	 al.add("@!@#");
	 Collections.sort(al);
	 Collections.sort(al);
	 System.out.println(al);
	 for(String v:al)
	 {
		 System.out.println(v);
	 }
	 
	 
}
}
