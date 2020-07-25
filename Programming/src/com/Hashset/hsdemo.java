package com.Hashset;
import java.util.HashSet;
public class hsdemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add(10);
		hs.add("Hello");
		hs.add(10.0);
		System.out.println(hs);
		System.out.println(hs.add(null));
		System.out.println(hs.add(10));
		System.out.println(hs);

	}

}
