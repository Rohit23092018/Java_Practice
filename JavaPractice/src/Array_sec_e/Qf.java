package Array_sec_e;

public class Qf 
{
	public static void main(String[] args) 
	{
		int ar[]= {78,77,78,17,71,17,78};
		int i,j,previousCount=0,count=0,temp;
		
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
			if(count<previousCount)
			{
				temp=ar[i];
				
			}
		}
	}
}
