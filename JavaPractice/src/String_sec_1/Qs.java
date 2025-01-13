package String_sec_1;

public class Qs 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i;
		
		for(i=0;i<arr.length;i++)
		{
			if(!((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a' && arr[i]<='z') || (arr[i]>='0' && arr[i]<='9')))
			{
				System.out.println(arr[i]);
			}
		}
	}
}
