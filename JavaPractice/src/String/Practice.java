package String;

public class Practice 
{
	public static void main(String[] args) 
	{
//		String s="Sathya";
//		System.out.println(s);
//		
//		String s1=s.concat(" tech");
//		System.out.println(s1);
//		
//		String s2=new String("Sathya");
//		System.out.println(s1==s2);
//		
//		String s3="Sathya";
//		System.out.println(s==s3);
//		
//		String s4=new String("Sathya").intern();
//		System.out.println(s==s4);
//		
//		System.out.println(s.equals(s1));
//		
//		char ch[]= {'R','A','M'};
//		String str=new String(ch);
//		
//		System.out.println(str);
		
		String s="Welcome to sathya technologies";
		System.out.println(s.charAt(5));
		
		String s1=s.concat(" Ameerpet");
		System.out.println(s1);
		
		System.out.println(s.length());
		
		String s2="Welcome";
		char ch[]=s2.toCharArray();
		int i;
		for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		String name1="Rohit";
		String name2="welcome";
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.isEmpty());
		System.out.println(name1.replace('h', 'n'));
		
		System.out.println(name1.substring(2));
		System.out.println(name1.substring(0,3));
		
		System.out.println(name1.indexOf('i'));
		System.out.println(name2.lastIndexOf('e'));
		
		System.out.println(name2.toUpperCase());
		
		String str[]=s.split(" ");
		for(i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		String s5="       Welcome   to   Sathya    Technologies      ";
		System.out.println(s5.trim());
	}
}
