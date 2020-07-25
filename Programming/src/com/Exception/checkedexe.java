package com.Exception;

public class checkedexe {
public static void main(String[] args) {
	try {
		Class.forName("java.util.Sca nner");
		System.out.println("hi");
	} catch (ClassNotFoundException e) {
	System.out.println(e);
	}
	System.out.println("bye bye...");
}
}
