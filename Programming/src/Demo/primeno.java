package Demo;

import java.util.ArrayList;

public class primeno {

	public static boolean primeNo(int no)
	{
		
		for(int i=2;i<=no;i++)
		{
			if(no%i==0)
					return false;
		}
			return false;
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int requiredSize=5;
		for(int i=0,k=15;al.size()<requiredSize;i++,k++)
		{
			int no=k;
			boolean isPrime=primeNo(no);
			if(isPrime==true)
				al.add(no);
		}
		System.out.println(al);
	}

}

