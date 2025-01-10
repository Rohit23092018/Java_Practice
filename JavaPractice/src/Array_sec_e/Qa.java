package Array_sec_e;

public class Qa 
{
	public static void main(String[] args) 
	{
		int ar[]= {78,77,78,17,71,17,78};
		int i,j,k,count;
		
		for(i=0;i<ar.length-1;i++)
		{
			count=0;
			for(j=0;j<i;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				int occurance=0;
				for(k=0;k<ar.length;k++)
				{
					if(ar[i]==ar[k])
					{
						occurance++;
					}
				}
				if(occurance>1)
					System.out.print(ar[i]+" ");
			}
		}
	}
}
