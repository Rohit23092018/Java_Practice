package Array_sec_e;

public class Qe 
{
	public static void main(String[] args) 
	{
		int ar[]= {78,77,78,17,71,17,78};
		int i,count=0,j;
		
		for(i=0;i<ar.length;i++)
		{
			count=0;
			for(j=0;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}
