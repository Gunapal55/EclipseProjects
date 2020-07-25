package Patterns;

public class Buuble {

	public static void main(String[] args) 
	{
	
		
		int[]arr={50,30,80,13,87,00,72,1233,22,1456,3432};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
							
					
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}
