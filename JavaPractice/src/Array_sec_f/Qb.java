package Array_sec_f;

public class Qb 
{
	public static void main(String[] args) 
	{
		int ar[]= {49,57,78,12,36,18,89};
		int i,temp=ar[0];
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]<temp)
			{
				temp=ar[i];
			}
		}
		System.out.println(temp);
	}
}
