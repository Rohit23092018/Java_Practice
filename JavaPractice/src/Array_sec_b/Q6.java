package Array_sec_b;

public class Q6 
{	
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,square;
		for(i=0;i<a.length;i++)
		{
			square=0;
			square=a[i]*a[i];
			 System.out.println("Square of element " + a[i] + " = " + square);		}
	}
}