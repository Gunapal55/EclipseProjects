package Patterns;

public class recursivecaling 
{
	public static void main(String args[])
	{
		disp(5);
	}
	static void disp(int no)
	{
		if(no>=1)
		{
			System.out.println(no);
			no--;
			disp(no);
		}
	}
	
}