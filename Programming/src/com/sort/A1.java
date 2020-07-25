package com.sort;
import java.util.ArrayList;
import java.util.Collections;

public class A1 implements Comparable<A1> {
	int i;
	A1(int i){
		this.i =i;
	}
	public String toString(){
		return " "+i;
	}@Override
	public int compareTo(A1 ob) {
		
		if(this.i>ob.i)
			return 1;
		else if(this.i<ob.i)
			return -1;
		else
			return 0;
	}
	public static void main(String[] args) {
		A1 ob1 = new A1(20);
		A1 ob2 = new A1(10);
		A1 ob3 = new A1(5);
		
		ArrayList<A1> al = new ArrayList<>();
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		System.out.println(ob1.compareTo(ob2));
		Collections.sort(al);
	//	Collections.reverse(al); ---> to have descending order wise numbers		
		System.out.println(al);
		
	}
}
