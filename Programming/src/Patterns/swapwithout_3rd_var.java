package Patterns;

public class swapwithout_3rd_var
{
	public static void main(String[] args)
	{
		String s1="Hottest guy";
		String s2="Coolest guy";
		String a1;
		String a2;
		s1=s1+s2;
		a1=s1.substring(11);
		a2=s1.substring(0,11);
		
		System.out.println("1-->"+a1);
		System.out.println("2-->"+a2);
		
	}

}
