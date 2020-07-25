package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectReadWrite ob = new ObjectReadWrite();
		//created object of the class whose object we want to write
	
	//initalize object
		ob.name="corona";
		ob.bankbalace = 21442;
		//declaring the file name
		String FileName = "elf.ser";
	// 1. convert object into outputstream-->ObjectOutpurstream class
		// 2. Save this stream into a file--> FileOutputStream
	
		ObjectOutputStream obj = new  ObjectOutputStream(new FileOutputStream(FileName));
		obj.writeObject(ob);//call writeobject() and pass object to be written as an argument
		//close the stream
		obj.close();
		
System.out.println("Done writing the object");		

// 2. Reading of objects from file
//reading using object input stream class
//create an object of objectinputstream convert the object data from file input stream
//display the object in the console
ObjectInputStream is = new ObjectInputStream(new FileInputStream(FileName));
	//call the readobject()

			ObjectReadWrite objnew	=(ObjectReadWrite)is.readObject();
//dowcasting it to from parent type of object into objectreadwrite type.

//print in console
			
			System.out.println("The name is : " + objnew.name+ "  and the bank balance is "+objnew.bankbalace );
//need to close the stream
			is.close();
		
	}
}
