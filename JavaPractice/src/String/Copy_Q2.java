package String;

public class Copy_Q2 {

	public static void main(String[] args) 
	{
		String str="Rohit Kumar";
		String str1="";
		int i;
		
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
	}

}
