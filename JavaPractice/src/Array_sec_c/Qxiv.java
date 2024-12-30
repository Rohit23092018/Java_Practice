package Array_sec_c;

public class Qxiv 
{
	static int factorial(int rem)
	{
		int fact=1;
		for(int i=rem;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int ar[]= {145,6,37,131,153,56,33,1634};
		int i,temp,rem;
		for(i=0;i<ar.length;i++)
		{
			temp=ar[i];
			int strong=0;
			while(temp!=0)
			{
				rem=temp%10;
				strong=strong+factorial(rem);
				temp=temp/10;
			}
			if(strong==ar[i])
			{
				System.out.println(ar[i]);
			}
		}
	}
}
