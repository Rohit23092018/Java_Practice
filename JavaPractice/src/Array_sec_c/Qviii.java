package Array_sec_c;

import java.util.Scanner;

public class Qviii 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=0,digits=0,temp=0;
		
		System.out.print("enter the number:-");
		number=sc.nextInt();
		
		temp=number;
		while(temp!=0)
		{
			temp=temp/10;
			digits++;
		}
		System.out.println(number+" have "+digits+" digits.");
	}
}
