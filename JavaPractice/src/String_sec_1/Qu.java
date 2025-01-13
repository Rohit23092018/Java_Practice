package String_sec_1;

public class Qu 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i;
		
		System.out.println("Printing odd index value:-");
		
		for(i=0;i<arr.length;i++)
		{
			if(!(i%2==0))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
