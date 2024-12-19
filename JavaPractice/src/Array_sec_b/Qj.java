package Array_sec_b;

public class Qj 
{
	public static void main(String[] args) 
	{
		char ch[]= {'$','@','t','h','@','T','e','c','h','2','7','Y','E','a','r','$','2','4','/','7'};
		int i,lowerCasecount=0,upperCasecount=0;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				upperCasecount++;
			}
			if(ch[i]>=97 && ch[i]<=122)
			{
				lowerCasecount++;
			}
		}
		System.out.println("Lowercase count="+lowerCasecount+"    Uppercase count="+upperCasecount);
	}
}
