package Array_sec_d;

public class Qd 
{
	public static void main(String[] args) 
	{
		int ar[]= {35,73,92,17,71,69};
		int i,j,count;
		
		for(i=0;i<ar.length;i++)
		{
			count=0;
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[i]>=ar[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count!=0)
				System.out.print(ar[i]+" ");
		}
		System.out.print(ar[ar.length-1]);
	}
}
