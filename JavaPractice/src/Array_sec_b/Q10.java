package Array_sec_b;

public class Q10 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}
