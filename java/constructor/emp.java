package com.constructor;

public class emp {
	int id;
	String name;
	double salary;
	
	emp(int id, String name, double salary)
	{
		this.id= id;
		this.name= name;
		this.salary = salary;
		
	}
	public static void main(String[] args)
	{	

	emp emp1 = new emp(1, "Ram", 12553);
	emp emp2 = new emp(2, "Sham",2134);
	emp emp3 = new emp(3, "Shankar", 45763);
	System.out.println("Employee id is "+emp1.id+", name is "+emp1.name+" and salary is "+emp1.salary);
	System.out.println("Employee id is "+emp2.id+", name is "+emp2.name+" and salary is "+emp2.salary);
	System.out.println("Employee id is "+emp3.id+", name is "+emp3.name+" and salary is "+emp3.salary);
	
	}
}
