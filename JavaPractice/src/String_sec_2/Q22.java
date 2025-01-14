package String_sec_2;

public class Q22 
{
	public static void main(String[] args) 
	{
		String str="$@thyaTecH@25YearS";
		String str1="";
		int i;
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("New String:-"+str1);
	}
}
