package Array_sec_b;

public class Qa 
{
	public static void main(String[] args) 
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
}
