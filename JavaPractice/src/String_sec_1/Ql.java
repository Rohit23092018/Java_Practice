package String_sec_1;

public class Ql 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','x','3','m','x','@','p','7','m','4','$'};
		
		char ch=arr[0];
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("character is alphabet");
		}
		else
			System.out.println("character is not alphabet");
	}
}
