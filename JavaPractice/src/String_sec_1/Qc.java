package String_sec_1;

import java.util.Scanner;

public class Qc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;
		
		System.out.println("enter the character:-");
		ch=sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("not an alphabet");
		}
	}
}
