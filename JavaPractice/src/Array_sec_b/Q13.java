package Array_sec_b;

public class Q13 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,count=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("Number of even numbers="+count);
	}
}
