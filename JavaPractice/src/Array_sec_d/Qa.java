package Array_sec_d;

public class Qa 
{
	public static void main(String[] args) 
	{
		int ar[]= {35,73,92,17,71,69};
		int i,flag=0;
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]==17)
				flag=1;
		}
		if(flag==1)
			System.out.println("Number is present");
		else
			System.out.println("number is not present");
	}
}
