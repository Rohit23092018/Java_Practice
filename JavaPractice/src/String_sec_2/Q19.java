package String_sec_2;

public class Q19 
{
	public static void main(String[] args) 
	{
		String str="$@thyaTecH@25YearS";
		int i;
		
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122))
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
