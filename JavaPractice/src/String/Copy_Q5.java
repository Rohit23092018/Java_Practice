package String;

public class Copy_Q5 
{
	public static void main(String[] args) 
	{
		String str="Sathya@7739";
		int sum=0,i;
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println("Sum="+sum);
	}
}
