package String_sec_1;

import java.util.Scanner;

public class Qf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int ascii;
		
		System.out.println("Enter the Ascii value:-");
		ascii=sc.nextInt();
		
		char ch=(char)ascii;
		System.out.println("Ascii value of "+ascii+" for "+ch);
	}
}
