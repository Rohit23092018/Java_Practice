package Array_2D;

import java.util.Scanner;

public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int ar[][]= new int[][]{
								{1,2,3,4},
								{5,6,7,8},
								{9,2,4,5},
								{1,3,6,7}
							   };
		int i,j,evensum=0,oddsum=0;
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				if(ar[i][j]%2==0)
				{
					evensum+=ar[i][j];
				}
				else
				{
					oddsum+=ar[i][j];
				}
			}
		}
		System.out.println("Sum of Even numbers:-"+evensum);
		System.out.println("Sum of Odd numbers:-"+oddsum);
	}
}
