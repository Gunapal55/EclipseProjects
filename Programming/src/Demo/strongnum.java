package Demo;

import java.util.ArrayList;

public class strongnum
{
	public static boolean strongNo(int num)
	{
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			return true;
		}
		return false;
			}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		int requiredSize=5;
		for(int i=0, k=0;al.size()<requiredSize;k++)
		{
			int num=k;
			boolean isStrong=strongNo(num);
				if(isStrong==true)
				{
					al.add(num);
					i++;
				}
	}
		System.out.println(al);
}
}
