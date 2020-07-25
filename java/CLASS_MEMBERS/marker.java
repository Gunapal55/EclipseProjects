package com.CLASS_MEMBERS;

public class marker {
static int length;
static String color;

 static {
	 length = 10;
	 color = "red";
 }

 public static void main(String[] args) {
	System.out.println(marker.color);
	System.out.println(marker.length);
	marker.color = "blue";
	marker.length = 12;
	System.out.println(marker.color);
	System.out.println(marker.length);
 }
}
// o/p is one marker(static is of one copy) becz string non primitive.