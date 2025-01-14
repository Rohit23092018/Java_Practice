package String_sec_2;

public class Q12 
{
	public static void main(String[] args) 
	{
		String s="Sathya";
		int i;
		String str="";
		for(i=s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		System.out.println(str);
	}
}
