package Array_2D;

import java.util.Scanner;

public class Q6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int ar[][]=new int[2][2];
		int i,j;
		
		System.out.println("Enter the elements of a matrix:-");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Before transpose of a matrix:-");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After transpose of a matrix:-");
		for(j=0;j<ar.length;j++)
		{
			for(i=0;i<ar.length;i++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
