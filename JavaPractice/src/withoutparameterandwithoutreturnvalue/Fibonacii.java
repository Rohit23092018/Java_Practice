package withoutparameterandwithoutreturnvalue;

import java.util.Scanner;

public class Fibonacii 
{
	public static void main(String[] args) 
	{
		fibonacii();
	}
	public static void fibonacii()
	{
		Scanner sc=new Scanner(System.in);
		int fib1=0,fib2=1,fib3=0,limit=0;
		System.out.print("Enter the limit of Fibonacii series:-");
		limit=sc.nextInt();
		System.out.print(fib1+" "+fib2);
		for(fib3=0;fib3<=limit;fib3++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(" "+fib3);
		}
	}
}
