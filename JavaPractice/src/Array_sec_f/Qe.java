package Array_sec_f;

public class Qe
{
	public static void main(String[] args) 
	{
		int ar[]= {49,57,78,12,36,18,89};
		int i,j,temp=0;
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		int product=1;
		for(i=0;i<ar.length;i++)
		{
			if(i<=1)
			{
				product=product*ar[i];
			}
		}
		System.out.println("Output="+product);
	
	}
}
