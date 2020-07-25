package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
public static void main(String[] args) throws IOException {
	FileWriter f = new FileWriter("elf.txt");
	//call write()
	f.write("welcome to unlockdown1.0");
	//close the stream
//	f.close();
	//or we can use flush ()
	f.flush();
	System.out.println("success");
}
}
