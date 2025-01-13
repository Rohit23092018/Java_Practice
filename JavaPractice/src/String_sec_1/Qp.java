package String_sec_1;

public class Qp 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>='a' && arr[i]<='z')
			{
				System.out.println(arr[i]);
			}
		}
	}
}
