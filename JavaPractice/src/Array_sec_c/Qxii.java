package Array_sec_c;

public class Qxii 
{
	public static void main(String[] args) 
	{
		int ar[]= {6,131,37,145,153,56,33,1634,28};
		int i,j,sum;
		for(i=0;i<ar.length;i++)
		{
			sum=0;
			for(j=1;j<ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					sum+=j;
				}
			}
			if(sum==ar[i])
			{
				System.out.println(ar[i]+" is perfect number");
			}
		}
	}
}
