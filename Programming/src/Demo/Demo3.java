package Demo;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
public class Demo3 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		ar.add(10);
		ar.add(20.1);
		ar.add("hello");
		ar.add(true);
		ar.add('a');
		ar.add("hello");
		ar.add(null);
		System.out.println(ar);
		System.out.println(ar.remove(null));
		System.out.println(ar);
		System.out.println(ar.remove(1));
		System.out.println(ar);
		System.out.println(ar.contains(10));
		System.out.println(ar.set(3, "frnds"));
		System.out.println(ar);
		ar.add(1, 3);
		ar.indexOf(10);
		ar.lastIndexOf("hello");
		List ar2 = ar.subList(2, 4);
		System.out.println(ar2);
		System.out.println(ar);
		System.out.println(ar);
		ar.clear();
		System.out.println(ar);
		
		
		
		
	}

}
