package Array_sec_b;

public class Qg 
{
	public static void main(String[] args)
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i,sum=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				System.out.println(ch[i]);
			}
		}
	}
}
