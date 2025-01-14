package String_sec_2;

public class Q6 {

	public static void main(String[] args) {
		
		String str="$@thyaTecH@25YearS";
		
		if((str.charAt(str.length()-1)>=65 && str.charAt(str.length()-1)<=90) || (str.charAt(str.length()-1)>=97 && str.charAt(str.length()-1)<=122))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not Alphabet");
		}
	}

}
