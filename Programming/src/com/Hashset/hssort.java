package com.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class hssort {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		System.out.println(hs);
		ArrayList<Integer> al = new ArrayList<>(hs);// for sorting it should be of generic type.
		System.out.println(al);
		Collections.sort(al); // for sorting we need to convert it into arraylist and then sort otherwise we cannot  be able to sort.
		System.out.println(al);
	
	}
}
