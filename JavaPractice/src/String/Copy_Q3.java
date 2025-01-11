package String;

public class Copy_Q3 
{
	public static void main(String[] args) 
	{
		int alphabet=0,digit=0,symbol=0;
		int i;
		
		String str="sathya@1234";
				
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				alphabet++;
			}
			else if(ch>='0' && ch<='9')
			{
				digit++;
			}
			else
			{
				symbol++;
			}
		}
		System.out.println("Alphabets="+alphabet);
		System.out.println("Digits="+digit);
		System.out.println("Symbol="+symbol);
	}
}
