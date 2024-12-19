package withparameterandnoreturnvalue;

import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digits");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		digitSum(a,b,c);
	}
	public static void digitSum(int a,int b,int c)
	{
		int addition=0;
		addition=a+b+c;
		System.out.println(addition);
	}

}
