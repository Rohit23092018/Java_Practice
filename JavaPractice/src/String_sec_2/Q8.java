package String_sec_2;

public class Q8 
{
	public static void main(String[] args) 
	{
		String str="$@thyaTecH@25YearS";
		int i,count=0;
		
		for(i=0;i<str.length();i++)
		{
			if(str.length()%2==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}
}
