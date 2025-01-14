package String_sec_2;

public class Q26 
{
	public static void main(String[] args) 
	{
		String str="This is java exam code";
		int i,count=0;
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' '||i==str.length()- 1) 
	        {
				count++;
	            while(i<str.length() && str.charAt(i)==' ') 
	            {
	            	i++;
	            }
	        }
		}
		System.out.println(count + " words are present in the given String.");
	}
}
