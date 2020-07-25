package com.generics;

public class demo2 {
public static void main(String[] args) {
	
	Integer i1 = 10;
	Integer i2 =20;


System.out.println(i1.compareTo(i2));//comparable of i1 is calling i2--> -1(negative 1)
System.out.println(i2.compareTo(i1));//compare of i2 is calling i1--> 1(positive 1)
System.out.println("abc".compareTo("xyz"));//--> -23 accepted object is larger than invoking Object i.e. abc thats why its negative 23
System.out.println("xyz".compareTo("abc"));//--> 23


}
}
