package Array_sec_b;

public class Q12 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of negative elements="+sum);
	}
}
