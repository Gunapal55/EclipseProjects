package com.interface1;
//Abstraction with the help of interface
 class B1 implements A1 {

	 public void test(){
		 
		 System.out.println("from test() implemented in B");
		 
	 }
	 
	 public static void main(String[] args) {
		B1 a = new B1();
		a.test();
	}
}
