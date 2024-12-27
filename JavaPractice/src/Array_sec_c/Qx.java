package Array_sec_c;

public class Qx 
{
	public static void main(String[] args) 
	{
		int ar[]= {6,131,37,145,153,56,33,1634};
		int i,j,count;
		for(i=0;i<ar.length;i++)
		{
			count=0;
			for(j=1;j<=ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
				System.out.println(ar[i]+" is prime number");
			else
				System.out.println(ar[i]+" is not a prime number");
		}
	}
}
