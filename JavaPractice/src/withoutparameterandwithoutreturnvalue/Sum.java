package withoutparameterandwithoutreturnvalue;

import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) 
	{
		digitSum();
	}
	public static void digitSum()
	{
		int a,b,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digits value");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		System.out.println(sum);
	}
}
