package Array_sec_b;

public class Qh 
{
	public static void main(String[] args) 
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i,count=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				count++;
			}
		}
		System.out.println(count+" UpperCase Characters.");
	}
}
