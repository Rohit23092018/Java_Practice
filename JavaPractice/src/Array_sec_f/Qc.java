package Array_sec_f;

public class Qc 
{
	public static void main(String[] args) 
	{
		int ar[]= {49,57,78,12,36,18,89};
		int i,tempsmall=ar[0],templarge=0,sum=0;
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]>templarge)
			{
				templarge=ar[i];
			}
			
			if(ar[i]<tempsmall)
			{
				tempsmall=ar[i];
			}
		}
		sum=tempsmall+templarge;
		System.out.println("Output="+sum);
	}
}
