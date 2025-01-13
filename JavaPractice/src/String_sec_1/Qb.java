package String_sec_1;

import java.util.Scanner;

public class Qb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;
		 
		System.out.println("Enter the character:-");
		ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UpperCase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lowercase");
		}
		else
		{
			System.out.println("Digit");
		}
	}
}
