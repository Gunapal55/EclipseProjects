package Demo;

import java.util.ArrayList;

public class Employee {

	
	String name;
	int eid;
	double salary;
	Employee() { }
	public Employee(String name, int eid, double salary) 
	{
	
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	
		public String toString() // need to Override the to string method and if we dont we will get referance address in order to get content override it
		{
			return "EMP name is "+name+ " Emp id is "+eid+ " Salary is "+salary;
		}
	public static void main(String[] args) {
		
			Employee e1 = new Employee("gp",123,6.2);
			ArrayList al = new ArrayList();
			
			al.add(new Employee("liki",234,29.45));
			al.add(e1);
			al.add(10);
			al.add("hello");
			System.out.println(al);		
			
	}
}
