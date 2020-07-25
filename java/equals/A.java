package com.equals;

public class A {
	int i;
	A(int i){
		this.i =i;
	}
	public boolean equals(Object ob){
		
		return this.i == ((A)ob).i;
	}
public static void main(String[] args) {
	
	A ob = new A(10);
	A ob1 = new A(10);
	boolean res = ob.equals(ob1);
	System.out.println(res);
	 
	
	
}

}
