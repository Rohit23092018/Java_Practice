package String_sec_2;

import java.util.Scanner;

public class Q23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str="$@thyaTecH@25YearS";
		char ch;
		int i,count=0;
		
		System.out.println("Ente the character to check:-");
		ch=sc.next().charAt(0);
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count>1)
			System.out.println("Character is duplicated");
		else
			System.out.println("Character is not duplicated");
	}
}
