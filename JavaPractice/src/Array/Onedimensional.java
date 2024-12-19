package Array;

import java.util.Scanner;

public class Onedimensional 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements:-");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("********Array Elements********");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
