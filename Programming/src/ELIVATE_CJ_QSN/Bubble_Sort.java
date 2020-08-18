package ELIVATE_CJ_QSN;

public class Bubble_Sort 
{
	public static void main(String[] args) {		
	int temp;
	int [] a ={12,1,45,33,12};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j =0; j < a.length-1; j++) 
		{
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int k=0;k<a.length;k++){
		System.out.print(" "+a[k]);
	}
	}
}	