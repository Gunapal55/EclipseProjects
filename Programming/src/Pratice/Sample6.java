package Pratice;

public class Sample6
{
 public static void main(String[] args)
 {
	int[] arr={10,20,30};
	try
	{
		int i=1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(arr[6]);
	}
 catch(ArrayIndexOutOfBoundsException e)
	{
	 System.out.println("caugth");
	}
 
 
 }
}
