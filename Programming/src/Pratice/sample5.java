package Pratice;

public class smaple5{

	public static void main(String[] args)
	
	{
	
		System.out.println("-----Main starts------");

		try
		{
			int i=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sigthu");
		}
		 catch(ArrayIndexOutOfBoundsException e)
		{
		 System.out.println("caugth");
		}
		
		System.out.println("-----Main ends------");
	}

}
