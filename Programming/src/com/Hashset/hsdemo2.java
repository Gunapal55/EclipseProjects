package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hsdemo2 {
public static void main(String[] args) {
	
	HashSet hs = new HashSet();
	  hs.add(10);
	  hs.add(20);
	  hs.add(30);
	  
	  //Acessing using foreach
	  for(Object x:hs)
	  {
		  Integer i = (Integer)x;
		  System.out.println(i+10);
	//	  System.out.println((Integer)x+10); direct downcasting 
		
	  }
	  System.out.println("Using itreator()");
	  Iterator t=hs.iterator();
	  while(t.hasNext())
	  {
		  Object e=t.next();
				  System.out.println((Integer)e+10);
	  }
	  
}
}
