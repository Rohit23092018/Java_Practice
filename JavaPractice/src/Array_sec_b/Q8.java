package Array_sec_b;

public class Q8 
{
	public static void main(String[] args) 
	{
		int a[]= {31,4,-35,-16,89};
		int i;
		boolean allpositive=true;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				allpositive=false;
				break;
			}
		}
		if(allpositive)
			System.out.println("All the elements present in the array must be positive");
		else
			System.out.println("All the elements present in the array must not be positive");
	}
}
