package Array_2D;

import java.util.Scanner;

public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[2][2];
		int i,j,sum=0;
		
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
				sum=sum+ar[i][j];
			}
		}
		
		System.out.println("Sum="+sum);
	}
}
