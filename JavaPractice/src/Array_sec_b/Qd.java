package Array_sec_b;

public class Qd 
{
	public static void main(String[] args)
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i,vowelcount=0,digitcount=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				vowelcount++;
	
			if(ch[i]>='0' && ch[i]<='9')
				digitcount++;
		}
		System.out.println("No of digits:-"+digitcount+","+"No of vowels:-"+vowelcount);
	}
}
