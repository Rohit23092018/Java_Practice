package String_sec_1;

public class Qv 
{
	public static void main(String[] args) 
	{
		char arr[]= {'a','X','3','m','x','@','p','7','m','4','$'};
		
		int i,j,count=0,k,apperance=0;
		
		for(i=0;i<arr.length;i++)
		{
			apperance=0;
			for(k=0;k<i;k++) 
			{
				if(arr[i]==arr[k])
				{
					apperance++;
				}
			}
			if(apperance==0)
			{
				count=0;
				for(j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				if(count>1)
					System.out.println(arr[i]+" Character is duplicated");
			}
		}
	}
}
