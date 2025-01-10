package Array_2D;

import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the row size:-");
		int row=sc.nextInt();
		System.out.println("Enter the col size:-");
		int col=sc.nextInt();
		
		int ar[][]=new int[row][col];
		int ar1[][]=new int[row][col];
		int result[][]=new int[row][col];
		int i,j;
		
		System.out.println("Enter the first array elements:-");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the second array elements:-");
		for(i=0;i<ar1.length;i++)
		{
			for(j=0;j<ar1.length;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				result[i][j]=ar[i][j]+ar1[i][j];
			}
		}
		
		System.out.println("The resultant matrix is:-");
		for(i=0;i<result.length;i++)
		{
			for(j=0;j<result.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
