package String_sec_2;

public class Q25 
{
	public static void main(String[] args) 
	{
		String str="This is java   exam code";
		String str1[]=str.trim().split("\\s+");
		int i,count=0;
		
		for(i=0;i<str1.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
