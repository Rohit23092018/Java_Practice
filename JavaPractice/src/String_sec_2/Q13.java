package String_sec_2;

public class Q13 
{
	public static void main(String[] args) 
	{
		String s="Sathya";
		int i;
		
		for(i=s.length()-1;i>=0;i--)
		{
			int value=s.charAt(i);
			System.out.println("Ascii value of "+s.charAt(i)+" is "+value);
		}
	}
}
