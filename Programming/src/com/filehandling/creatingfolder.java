package com.filehandling;

import java.io.File;

public class creatingfolder {
public static void main(String[] args) {
//Created an object of file class and pass the folder name in the argument
	File f = new File("testing01elf");
	//Create a folder using mkdir()
	if(f.mkdir())
	{
		System.out.println("Successfully created the folder");
	}
	else
	{
		System.out.println("Failed to creat the folder");
	}
f.delete();
}
}
