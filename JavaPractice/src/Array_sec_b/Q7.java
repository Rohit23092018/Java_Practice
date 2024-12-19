package Array_sec_b;

public class Q7 
{	
	public static void main(String[] args) 
	{

		int a[]= {31,4,-35,-16,89};
		int i,cube,sum=0;
		for(i=0;i<a.length;i++)
		{
			cube=0;
			cube=a[i]*a[i]*a[i];
			sum=sum+cube;
		}
		System.out.println("Print sum of cubes of an given array="+sum);
	}
}
