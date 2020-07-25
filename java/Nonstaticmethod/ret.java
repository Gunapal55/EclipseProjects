package com.Nonstaticmethod;

public class ret 
{
int i;
static ret geneob()
{
	ret ob = new ret();
	return ob;
}
public static void main(String[] args) {
	
	ret x=geneob();
	x.i=100;
	System.out.println(x.i);

  }
}
