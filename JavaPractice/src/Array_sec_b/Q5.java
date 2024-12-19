package Array_sec_b;

public class Q5 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,product=1;
		for(i=0;i<a.length;i++)
		{
			product*=a[i];
		}
		System.out.println("Product of the array elements="+product);
	}
}
