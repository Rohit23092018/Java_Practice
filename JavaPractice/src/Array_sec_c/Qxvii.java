package Array_sec_c;

public class Qxvii 
{
	public static void main(String[] args) 
	{
		int ar[]= {145,6,37,131,153,56,33,1634};
		int i,temp,count,temp2,j,rem,arm;
		
		for(i=0;i<ar.length;i++)
		{
			temp=ar[i];
			count=0;
			while(temp!=0)
			{
				temp=temp/10;
				count++;
			}
			
			temp2=ar[i];
			arm=0;
			while(temp2!=0)
			{
				rem=temp2%10;
				int power=1;
				for(j=0;j<count;j++)
				{
					power=power*rem;
				}
				arm=arm+power;
				temp2=temp2/10;
			}
			if(arm==ar[i])
				System.out.println(ar[i]);
		}
	}
}
