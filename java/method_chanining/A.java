package com.method_chanining;

public class A {
int i;
	static A geneob()
	{
		return new A();
	}
 A inti(int i)
 {
	 this.i =i;	
	return this;
 }
  A display()
  {
	  System.out.println(this.i);
	return this;
  }
public static void main(String[] args) 
{	
	//A ob1 = geneob();
	//ob1.inti(100);
	
A ob = geneob().inti(100).display();// A method calling another method is called method chaining
A ob1 = geneob().inti(13200).display();
//System.out.println(ob1.i);
	//System.out.println(ob.i);
  }
}