package String;

import java.util.Scanner;

public class Copy_Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		String str1="";
		int i;
		
		System.out.println("Enter the String:-");
		str=sc.next();
		
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				str1=str1+(char)(ch+32);
			else
				str1=str1+(char)(ch-32);
		}
		System.out.println("Converted String:-"+str1);
	}
}
