package Array_sec_f;

import java.util.Scanner;

public class Qf 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[7];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry elements");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int ar1[]=new int[ar.length];
		
		
		int left=0;
		int right=ar.length-1;
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				ar1[left++]=ar[i];
			}
			else
			{
				ar1[right--]=ar[i];
			}
		}
		for(i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
  	}
}
