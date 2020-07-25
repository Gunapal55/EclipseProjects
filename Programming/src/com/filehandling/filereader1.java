package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class filereader1 {
	public static void main(String[] args) throws IOException {
		//create an object of file input stream
		FileInputStream f = new FileInputStream("elf.txt");
		
		int i =0;
		while( (i=f.read())!=-1)
		{
			System.out.print((char)i);//Convert integer asci value to character 
		}
		
		f.close();
		System.out.println();
		System.out.println("Successful");
	}

}
