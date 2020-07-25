package Demo;


	import java.util.ArrayList;

	public class D1 {
		
		public static void main(String[] args)
		{
			ArrayList al = new ArrayList();
			al.add(10);
			al.add(17);
			al.add(13);
			al.add(15);
			System.out.println(al);
			al.add("hello");
			al.add(true);
			al.add('A');
			al.add(10);
			al.add(null);
		System.out.println(al);
		al.set(3, "gp");
		System.out.println(al);
			System.out.println(al.get(3));
		}
	}


