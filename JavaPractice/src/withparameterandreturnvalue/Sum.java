package withparameterandreturnvalue;

import java.util.Scanner;

public class Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum=0;
		System.out.println("Enter the 3 digits");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=digitsum(a,b,c);
		System.out.println(sum);
	}
	static int digitsum(int a,int b,int c)
	{
		int addition=0;
		addition=a+b+c;
		return addition;
	}
}