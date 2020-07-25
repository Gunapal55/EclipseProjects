package Pratice;

 class demo

{
	public static void main(String[] args)
	{
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0);
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		
		}
		if (copy==sum)
		{
			System.out.println("Its a Armstrong Number");
		}
		else
		{
			System.out.println("Its not an Armstrong Number");
		}
	}
}
	
	
