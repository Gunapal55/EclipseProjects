package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(12);
	al.add(46);
	al.add(56);
	al.add(235);
System.out.println("---Using iterator()----");
Iterator<Integer> e= al.iterator();
while (e.hasNext())
{
Integer x = e.next();
if(x%2==0)
	System.out.println(x);
	
}
System.out.println("---Using get()----");
for (int i = 0; i <al.size(); i++)
{

	if(al.get(i)%2==0)
		System.out.println(al.get(i));
	
}
System.out.println("---Using for each()----");
for(Integer x: al)
{ if(x%2==0)
System.out.println(x);

}
}
}