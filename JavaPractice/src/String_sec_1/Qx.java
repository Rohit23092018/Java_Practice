package String_sec_1;

public class Qx 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i,sum=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
				sum=sum+(int)(arr[i]-48);
			}
		}
		System.out.println("Sum of digits in char array:-"+sum);
	}
}
