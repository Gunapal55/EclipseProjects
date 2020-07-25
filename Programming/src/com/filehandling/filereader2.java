package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader2 {
public static void main(String[] args) throws IOException 
	{
	//create an object
	FileReader f = new FileReader("elf.txt");
	//create a variable to Int type
	int i;
	//calling the method
	while((i=f.read())!=-1){
		System.out.print((char)i);
		
	}
f.close();
System.out.println();
System.out.println("Done reading..");
	
	
	
	
	}
}
