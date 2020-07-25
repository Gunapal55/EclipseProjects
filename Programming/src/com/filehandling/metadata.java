package com.filehandling;

import java.io.File;
import java.io.IOException;

public class metadata {
	
	public static void main(String[] args) throws IOException {
		File f = new File("elf6.txt");
		f.createNewFile();
		
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());// size of the file
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		
		
		f.delete(); //deletion of file
	
	}

}
