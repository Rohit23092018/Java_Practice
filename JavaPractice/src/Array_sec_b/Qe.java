package Array_sec_b;

public class Qe 
{
	public static void main(String[] args) 
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i,count=0;
		for(i=0;i<ch.length;i++)
		{
			if(!((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z')))
			{
				if(!(ch[i]>='0' && ch[i]<='9'))
				{
					count++;
				}
			}
		}
		System.out.println("Count the number of special characters:-"+count);
	}
}