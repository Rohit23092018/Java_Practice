package String_sec_1;

public class Qm 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','x','3','m','x','@','p','7','m','4','$'};
		
		char ch=arr[arr.length-1];
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Character is vowel");
		}
		else
			System.out.println("character is consonante");
	}
}
