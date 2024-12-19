package withoutparameterandreturnvalue;

import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		sum=digitSum();
		System.out.println(sum);
	}
	public static int digitSum()
	{
		int a,b,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digits");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		return sum;
	}

}
