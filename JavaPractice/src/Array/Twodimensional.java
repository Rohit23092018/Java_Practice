package Array;

import java.util.Scanner;

public class Twodimensional 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the row size:-");
		int row=sc.nextInt();
		System.out.print("Enter teh column size:-");
		int column=sc.nextInt();
		
		int ar[][]=new int[row][column];
		int i,j;
		System.out.println("Enter the array elements:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("********Array Elements*******");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println("");
		}
	}
}