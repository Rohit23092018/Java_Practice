package Array_sec_b;

public class Q14 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,oddproduct=1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				oddproduct*=a[i];
			}
		}
		System.out.println("Product of odd numbers from the given array="+oddproduct);
	}
}
