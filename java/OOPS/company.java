package com.OOPS;

public class company {
public static void main(String[] args) {
	Emp e1 = new Emp("gp",12.5);
	System.out.println(e1.name);
	System.out.println(e1.sal);
	e1.sal =2;
	System.out.println(e1.sal);
	System.out.println(e1.getsal());
	e1.setsal(40);
	System.out.println(e1.sal);
}
}
