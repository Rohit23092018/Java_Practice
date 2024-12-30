package Array_sec_d;

public class Qf 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,3,6,8};
		int i,j;
		
		for(i=0;i<ar.length-1;i++)
		{
			for(j=ar[i]+1;j<ar[i+1];j++)
			{
				
				System.out.print(j+" ");
			}
		}
	}
}
