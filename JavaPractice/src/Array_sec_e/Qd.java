package Array_sec_e;

public class Qd 
{
	public static void main(String[] args) 
	{
		int ar[]= {78,77,78,17,71,17,78};
		int i,count,j,occurance=0,k;
		for(i=0;i<ar.length;i++)
		{
			count=0;
			for(k=0;k<i;k++)
			{
				if(ar[i]==ar[k])
				{
					count++;
				}
			}
			if(count==0)
			{
				occurance=0;
				for(j=0;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						occurance++;
					}
				}
				System.out.println(ar[i]+"--"+occurance);
			}
		}
	}
}
