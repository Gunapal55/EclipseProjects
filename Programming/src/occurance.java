
public class occurance {

	public static void main(String[] args)
	{
	 int no = 8818;
	 int count = 0;
	 while(no!=0)
	 {
		 int rem= no%100;
		 if(rem==88)
		 {
			 count=count+2;
			 
		 }
	   if(rem%10==8)
	   {
		   count=count++;
	   }
	 
	   System.out.println(count);
	 }
	 

	}

}
