package Pratice;

public class Samplu2
{
 public static void main(String[] args)
 {
	int[] arr={10,20,30};
	try
	{
		System.out.println(arr[6]);
	}
 catch(ArrayIndexOutOfBoundsException e)
	{
	 System.out.println("caugth");
	}
 
 
 }
}
