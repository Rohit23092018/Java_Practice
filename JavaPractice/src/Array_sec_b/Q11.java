package Array_sec_b;

public class Q11 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,even=-1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even=a[i];
			}
		}
		System.out.println("Last even number in the array="+even);
	}
}