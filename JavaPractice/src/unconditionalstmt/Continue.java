package unconditionalstmt;
public class Continue 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("i="+i);
		}
	}

}
