package Pratice;

public class smaplu {

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
		
		System.out.println("-----Main ends------");
	}

}
