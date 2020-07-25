package com.toString;

public class Employee {
	
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
@Override
public String toString(){
	
	return "Employee name is "+this.name+ " id is "+this.id+" salary is "+this.salary;
	
}
}
