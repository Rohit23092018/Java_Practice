package Array_sec_f;

public class Qf 
{
	public static void main(String[] args) 
	{
		int ar[]= {49,57,78,12,36,18,89};
		int ar1[]=new int[7];
		int i;
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ar1[i]=ar[i];
			}
			System.out.println(ar1[i]);
		}
	}
}
