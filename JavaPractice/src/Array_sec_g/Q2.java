package Array_sec_g;

public class Q2 
{
	public static void main(String[] args) 
	{
		int ar[]= {35,871,5624,9421};
		int i,temp=0,rem,count;
		
		for(i=0;i<ar.length;i++)
		{
			temp=ar[i];
			count=0;
			while(temp!=0)
			{
				temp=temp/10;
				count++;
			}
			System.out.println(i+"-->"+count);
		}
	}
}
