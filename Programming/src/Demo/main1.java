package Demo;

import java.util.HashSet;

public class main1 {
public static void main(String[] args) {
	
	HashSet<Employeeset> hs= new HashSet<>();
	
	hs.add(new Employeeset("Jack",132,3.5));
	hs.add(new Employeeset("Rayan",726,5.5));
	System.out.println(hs.add(new Employeeset("Jack",132,4.2)));
	
	System.out.println(hs);
	
	}
}

