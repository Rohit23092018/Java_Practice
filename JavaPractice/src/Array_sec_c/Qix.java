package Array_sec_c;

public class Qix 
{
	public static void main(String[] args) 
	{
		int ar[]= {6,131,37,145,153,56,33,1634};
		int i,j;
		for(i=0;i<ar.length;i++)
		{
			for(j=1;j<ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					System.out.print(j+",");
				}
			}
			System.out.println("");
		}
	}
}
