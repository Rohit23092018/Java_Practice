package Array_sec_e;

import java.util.Scanner;

public class Qb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]= {78,77,78,17,71,17,78};
		int i,number,count=0;
		
		System.out.print("Count the number of occurances given number:-");
		number=sc.nextInt();
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]==number)
			{
				count++;
			}
		}
		System.out.println("Output:-"+count);
	}
}
