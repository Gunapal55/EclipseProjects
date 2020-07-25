package com.OOPS;

public class Emp{
	String name;
	double sal;
	public char[] getsal;
	
public Emp(String name, double sal){
	this.name= name;
	this.sal = sal;
}
// sal readable
public double getsal()
{
	return this.sal;
}
//sal modification
public void setsal(double sal)
{
	if(sal>this.sal)
	{
		this.sal= sal;
		System.out.println("sal accepted");
	}
	else
	{
		System.out.println("not accepted");
	}
}
}
