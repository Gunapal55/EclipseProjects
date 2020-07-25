package Pratice;

import java.util.TreeSet;

public class test101 {
	private int empno;
	private String name;
	
public static void main(String[] args) {
	
	TreeSet emps = new TreeSet();
	emps.add(new test101());
	emps.add(new test101());
	System.out.println("Size :"+emps.size());
}
}
