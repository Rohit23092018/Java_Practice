package String_sec_2;

public class Q17 
{
	public static void main(String[] args) 
	{
		String s="sathya";
		String str="";
		int i;
		
		for(i=0;i<s.length();i++)
		{
			if(i==0)
			{
				str=str+(char)(s.charAt(i)-32);
			}
			else
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
