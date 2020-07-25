package Pratice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class cool {
public static void main(String[] args) {
	
	Collection values = new ArrayList();

	values.add(12);
	values.add("gp");
	values.add(12.87);
	values.addAll(values);
	
	/*
	for(Object x:values)
	{
		System.out.println(x);
	}
	*/
	
	
	values.forEach(System.out::println );
}
}
