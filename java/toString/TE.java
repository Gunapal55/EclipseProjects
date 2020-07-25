package com.toString;

public class TE extends Employee{
	String tool;
	
	public TE(String name, int id, double salary, String tool) 
	{
		super(name, id, salary);
		this.tool = tool;
	}
@Override
public String toString(){
	// return "Employee name is "+this.name+ " id is "+this.id+" salary is "+this.salary+" and tool is "+this.tool;
	return super.toString() +" and tool is "+this.tool;
	
}
}
