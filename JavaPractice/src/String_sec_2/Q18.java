package String_sec_2;

public class Q18 
{
	public static void main(String[] args) 
	{
		String str="$@thyaTecH@25YearS";
		int i,uppercase=0,lowercase=0,digits=0,symbols=0;
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				uppercase++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				lowercase++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				digits++;
			}
			else
			{
				symbols++;
			}
		}
		System.out.println("UpperCase character:-"+uppercase);
		System.out.println("LowerCase character:-"+lowercase);
		System.out.println("Digits:-"+digits);
		System.out.println("Symbols:-"+symbols);
	}
}
