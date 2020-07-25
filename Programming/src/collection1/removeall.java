package collection1;

import java.util.ArrayList;

public class removeall
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		l2.add(50);
		l2.add(60);
		l2.add(70);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
	}

}
