package loop;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		int i,j,k,l,m;
		for(i=1;i<=7;i++)
		{
			if(i%2==0)
				continue;
			else
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		for(k=5;k>=1;k--)
		{
			if(k%2==0)
				continue;
			else
				for(l=k;l>=1;l--)
				{
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
