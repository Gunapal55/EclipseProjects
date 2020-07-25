package Demo;

import java.util.ArrayList;

class pmnew{
	public static boolean primeNo(int no)
	{
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
				return false;
		}
		
			return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(11);
		al.add(3);
		al.add(17);
		al.add(12);
		al.add(31);
		al.add(28);

		for(int i=0;i<al.size();i++)
		{
			Integer x=al.get(i);
			boolean isPrime=primeNo(i);
			if(isPrime==true)
				System.out.println(x);
		}
		

	}

}

