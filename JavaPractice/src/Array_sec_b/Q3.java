package Array_sec_b;

public class Q3 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i,first=0,last=0;
		for(i=0;i<a.length;i++)
		{
			if(i==0)
				first=a[i];
			else if(i==(a.length-1))
				last=a[i];
		}
		System.out.println("Sum="+(first+last));
	}
}
