package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class iter {
public static void main(String[] args) {
	
	ArrayList<Integer> al =  new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	Iterator i = al.iterator();
	while(i.hasNext())
{
	Integer x = (Integer) i.next();
		System.out.println(x+10);

}
}
}
