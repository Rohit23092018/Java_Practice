package Array_sec_c;

public class Qiv
{
	public static void main(String[] args) 
	{
		int i,number=6,factsum=0;
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				factsum=factsum+i;
			}
		}
		if(number==factsum)
			System.out.println(number+" is the perfect number");
		else
			System.out.println(number+" is not a perfect number");
	}
}
