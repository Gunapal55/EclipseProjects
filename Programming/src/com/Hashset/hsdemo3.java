package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hsdemo3 {
public static void main(String[] args) {
	HashSet<Character> hs = new HashSet<>();
				hs.add('A');
				hs.add('z');
				hs.add('Z');
				hs.add('a');
				hs.add('1');
				hs.add(' ');
				System.out.println(hs);
		//		hs.add("Hello"); CTE-->  cannot add any other type other than char because hashset is of generic type
				
				for(Character c:hs)
				{		
					System.out.println(c+0);
}
				System.out.println("from iterator()");
			Iterator<Character>	t=hs.iterator();
			while(t.hasNext())
			{
		//		Character ch =t.next();
				System.out.println(t.next()+0);
			}
				
				
				
}
}
