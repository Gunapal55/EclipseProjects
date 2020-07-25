package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator1 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(25);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object e=i.next();
			System.out.println(e);
		}
	/*	System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());

*/


	}
}
