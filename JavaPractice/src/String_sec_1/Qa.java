package String_sec_1;

import java.util.Scanner;

public class Qa 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter the character to check:-");
		ch=sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("character is not vowel");
		}
	}
}
