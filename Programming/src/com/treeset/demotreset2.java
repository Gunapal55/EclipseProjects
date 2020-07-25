package com.treeset;

import java.util.TreeSet;

public class demotreset2 {
public static void main(String[] args) {
	TreeSet<String> str = new TreeSet<>();
		str.add("abc");
		str.add("ABC");
		str.add("xyz");
		str.add("XYZ");
		System.out.println(str);
		
		TreeSet<Character> ch = new TreeSet<>();
		ch.add('A');
		ch.add('a');
		ch.add('X');
		System.out.println(ch);
}
}
