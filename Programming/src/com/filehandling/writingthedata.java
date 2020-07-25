package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writingthedata {
public static void main(String[] args) throws IOException {
	FileOutputStream f = new FileOutputStream("elf.txt");
	//call write()
	f.write(65);//Through ascikeyvalue we are able to write
	//to close()
	f.close();
	
	
	
	
}
}
