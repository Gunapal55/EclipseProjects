package ArrayList;

import java.util.ArrayList;

public class eve {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<>();//Generic type
	al.add(10);
	al.add(12);
	al.add(13);
	al.add(17);
	al.add(16);
	al.add(20);
	al.add(24);
	al.add(29);
	
	 
	for(Integer x:al)//Generic  
	{
	//	Integer i =(Integer)x;
		if(x%2==0)
		{	
			System.out.println(x);
		}
	}
}
}
