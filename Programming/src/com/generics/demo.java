package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<>();
	
	al.add("Hi");
	al.add("Hello");
	al.add("Bye");
	al.add("How are you?");
	al.add("Who are you?");
	Collections.sort(al);
	for (String x : al) {
		System.out.println(x);
	}
}
}
