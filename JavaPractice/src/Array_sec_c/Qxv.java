package Array_sec_c;

public class Qxv 
{
	public static void main(String[] args) 
	{
		int ar[]= {145,6,37,131,153,56,33,1634};
		int i,count;
		for(i=0;i<ar.length;i++)
		{
			int temp=ar[i];
			count=0;
			while(temp!=0)
			{
				temp=temp/10;
				count++;
			}
			System.out.println(ar[i]+" have "+count+".");
		}
	}
}
