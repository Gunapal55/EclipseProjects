package com.treeset;

import java.util.TreeSet;

public class p1 implements Comparable<p1> {
	int i;
	p1() { }
	public p1(int i) {
		this.i = i;
	}
		public String toString() {
			return " "+i;
		}
		public int compareTo(p1 ob) //--> inorder to store the userdefined objects as comparable type
		{												//--> we need to override this.
			return this.i-ob.i;		
		}
	public static void main(String[] args) {
		TreeSet<p1> ts = new TreeSet<>();
		p1 ob = new p1(5);
		ts.add(new p1(7));
		ts.add(ob);
		ts.add(new p1(1)); 
		ts.add(new p1(54)); 
		ts.add(new p1(12)); 
		System.out.println(ts);
	}
}
