package Array_sec_b;

public class Qb 
{
	public static void main(String[] args) 
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i;
		for(i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				if((ch[i]>=65 && ch[i]<=90)||(ch[i]>=97 && ch[i]<=122))
					System.out.println("First character is alphabet");
				else
					System.out.println("First character is not an alphabet");
			}
		}
	}
}