package Array_2D;

import java.util.Scanner;

public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int i,j,row,col;
		
		System.out.println("Enter the row size:-");
		row=sc.nextInt();
		System.out.println("enter the column size:-");
		col=sc.nextInt();
		
		int ar[][]=new int[row][col];
		int ar1[][]=new int[row][col];
		int result[][]=new int[row][col];
		
		System.out.println("Enter the first array elements:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the second array elements:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		//Sum of two matrices
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				result[i][j]=ar[i][j]+ar1[i][j];
			}
		}
		
		System.out.println("First array:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second array:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After Sum of two matrices:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
