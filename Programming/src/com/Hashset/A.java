package com.Hashset;

import java.util.HashSet;

public class A{
	int i;
	A() { }
public A(int i) {
		
		this.i = i;
	}
public String toString(){
return " "+i; }
public boolean equals(Object ob){
	return this.i ==((A)ob).i;
}
public int hashCode(){
	return i;
}
public static void main(String[] args) {
	{
		A ob1 = new A(20);
		A ob2 = new A(30);
		A ob3 = new A(20); // to avoid duplicate objects we need to override hashcode and equals method.
		
	HashSet<A> hs = new HashSet<>();
		
		hs.add(ob1);
		System.out.println(hs);
		hs.add(ob2);
		System.out.println(hs);
		hs.add(ob3);
		System.out.println(hs);
	}
 }
}
