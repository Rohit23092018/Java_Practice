package Array_sec_e;

public class Qc 
{
	public static void main(String[] args) 
	{
		int ar[]= {78,77,78,17,71,17,78};
		int i,j,count,previousCount=0,temp=0;
		
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
			if(count>previousCount)
			{
				temp=ar[i];
				previousCount=count;
			}
		}
		System.out.println(temp);
	}
}
