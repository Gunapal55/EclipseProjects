package com.customexecption;

public class CustomExe  extends Throwable {

	String str;
	
	CustomExe() {  }

	public CustomExe(String str) {
		
		this.str = str;
	}
	public String toString(){ // override the tostring to show the message
		return ("this is my custom message: "+str);
	}
	
}
