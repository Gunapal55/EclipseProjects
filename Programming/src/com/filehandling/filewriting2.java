package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filewriting2 {
public static void main(String[] args) throws IOException {
	
	try {
		FileOutputStream f = new FileOutputStream("elf.txt");
//declaring the string
		String s= "welocome to lockdown 100.0";
	 
	           byte  b[]  =	s.getBytes();
	          //call write method
	           f.write(b);
	           f.close();//closing the stream
	System.out.println("Success");
	           
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	
	
	
}
}
