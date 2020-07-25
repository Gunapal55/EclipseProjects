package com.Exception;

public class NPE {
public static void main(String[] args) {
	try{
	E2 ob =null;
	System.out.println(ob.i);
	}
	catch(NullPointerException e){
		System.out.println("Can not store null it's nullpointerexception...");
	}
	
	
}
}
