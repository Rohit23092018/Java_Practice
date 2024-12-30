package Array_sec_d;

public class Qe 
{
	public static void main(String[] args) 
	{
		int ar[]= {35,73,92,17,71,69};
		int ar1[]= {36,73,95,17,76,69};
		int i,j;
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar1.length;j++)
			{
				if(ar[i]==ar1[j])
				{
					System.out.print(ar[i]+" ");
				}
			}
		}
	}

}
