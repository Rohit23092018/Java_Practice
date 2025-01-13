package String_sec_1;

public class Qy 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i,count=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				count++;
			}
		}
		System.out.println(count+" uppercase letters");
	}
}
