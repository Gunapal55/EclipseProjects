package Patterns;

public class Palendrome {

	public static void main(String[] args) 
	{
		
		String s1="ramar";
		String s2="";
		for(int i=s1.length()-1 ;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
			System.out.println(s2);
		
				
	
	if(s1.equals(s2))
	{
		System.out.println("is a palen");
	}else
	{
		System.out.println("NOT");
	}
}
}