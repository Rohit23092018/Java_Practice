package Array_sec_d;

import java.util.Scanner;

public class Qc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]= {35,73,92,17,71,69};
		int i;
		int temp=0,p1,p2;
		System.out.println("Enter the positions");
		p1=sc.nextInt();
		p2=sc.nextInt();
		
		System.out.println("Before swapping the value:-");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		
		temp=ar[p1];
		ar[p1]=ar[p2];
		ar[p2]=temp;
		
		System.out.println("After swapping the value:-");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}