package Array_sec_g;

public class Q1 
{
	public static void main(String[] args) 
	{
		int ar[]={36,37,67,56,88};
		int ar1[]=new int[5];
		int i;
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ar1[i]=ar[i];
			}
			else
			{
				ar1[i]=ar[i]+1;
			}
		}
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
	}
}
