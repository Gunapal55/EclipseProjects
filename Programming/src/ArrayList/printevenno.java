package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class printevenno {
public static void main(String[] args) {
	ArrayList<Integer> al =  new ArrayList<>();
	al.add(20);
	al.add(21);
	al.add(32);
	al.add(41);
	al.add(50);
	Iterator<Integer> i = al.iterator();
	while(i.hasNext())
{
		Integer e= i.next(); 
		if(e%2==0)
		System.out.println(e);

}
	System.out.println("-----------------------------------");
//get()
	for (int j = 0; j < al.size(); j++) {

	Integer e = al.get(j);
	if(e%2==0)
System.out.println(e);
	}
System.out.println("--------------------------------------");
//for each
for(Integer ev:al)
{
if(ev%2==0)
	System.out.println(ev);
}
}


}
