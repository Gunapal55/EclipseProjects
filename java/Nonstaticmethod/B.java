package com.Nonstaticmethod;

public class B 
{
int i;
int j;
boolean k;

void inti(int i, int j, boolean k)
{
	this.j = j;
	this.i =i;
	this.k = k;
	
	
}
	public static void main(String[] args) {
		
		B r1 = new B();
		r1.inti(12, 14, true);
		
		System.out.println(r1.i);
		System.out.println(r1.j);
		System.out.println(r1.k);
		System.out.println();

		r1.inti(13242, 11234, false);
		System.out.println(r1.i);
		System.out.println(r1.j);
		System.out.println(r1.k);
	}
}
