package Array_sec_c;

public class Qxvi 
{
	public static void main(String[] args) 
	{
		int ar[]= {145,6,37,131,153,56,33,1634};
		int i,rem,rev;
		for(i=0;i<ar.length;i++)
		{
			int temp=ar[i];
			rev=0;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(ar[i]==rev)
				System.out.println(ar[i]+" is palindrome number");
		}	
	}
}