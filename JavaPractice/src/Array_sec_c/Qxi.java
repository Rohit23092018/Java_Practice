package Array_sec_c;

public class Qxi 
{
	public static void main(String[] args) 
	{
		int ar[]= {6,131,37,145,153,56,33,1634};
		int i,j,k,temp=0,temp2=0,count=0;
		
		for(i=0;i<ar.length;i++)
		{
			temp=ar[i];
			for(j=1;j<=ar[i];j++)
			{
				if(temp%j==0)
				{
					temp2=j;
					count=0;
					for(k=1;k<=temp2;k++)
					{
						if(temp2%k==0)
							count++;
					}
					if(count==2)
						System.out.print(temp2+" ");
				}
			}
			System.out.println(" ");
		}
	}
}
