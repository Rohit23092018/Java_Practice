package String;

public class Copy_Q4 
{
	public static void main(String[] args) 
	{
		String str1="Madam";
		String str2="";
		int i;
		
		for(i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
