package Array_2D;

import java.util.Scanner;

public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[2][2];
		int i,j,rowsum=0,colsum=0;
		
		System.out.println("Enter the array elements:-");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<ar.length;i++)
		{
			rowsum=0;
			for(j=0;j<ar.length;j++)
			{
				rowsum=rowsum+ar[i][j];
			}
			System.out.println("Sum of row "+i+":"+rowsum);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(j=0;j<ar.length;j++)
		{
			colsum=0;
			for(i=0;i<ar.length;i++)
			{
				colsum=colsum+ar[i][j];
			}
			System.out.println("sum of col "+j+":"+colsum);
		}
	}
}
