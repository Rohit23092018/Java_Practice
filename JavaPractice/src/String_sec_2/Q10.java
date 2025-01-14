package String_sec_2;

public class Q10 
{
	public static void main(String[] args) 
	{
		String s="$athya";
		char ch[]=s.toCharArray();
		String str="";
		int i;
		
		for(i=0;i<ch.length;i++)
		{
			if(i==ch.length-1 && ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			str=str+ch[i];
		}
		System.out.println(str);		
	}
}
