package ArrayList;

import java.util.ArrayList;

public class foreachaccessing {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(12);
	
		al.add(10);
		
		for(Object ar:al){
			
			Integer i = (Integer)ar;
			System.out.println(i+10);
		}
	}
	
	
	
	
	
}
