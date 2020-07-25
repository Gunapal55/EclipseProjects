package Demo;

import com.treeset.p1;

public class Employeeset implements Comparable<Employeeset> {
	String name;
	int id;
	double salary;
	
	Employeeset() {   }

	public Employeeset(String name, int id, double salary) {
		
		this.name = name;
		this.id = id; 
		this.salary = salary;
	}	
	public String toString(){
		return name+" ,"+id+" ,"+salary;
	}
	public boolean equals(Object ob){
		return this.id == ((Employeeset)ob).id;
	}
	public int hashcode(){
		return id;
	}
	public int compareTo(Employeeset ob)
	{
		return this.id-ob.id;	
	}
}
