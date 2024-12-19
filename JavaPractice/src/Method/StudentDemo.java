package Method;

public class StudentDemo 
{
	void display(Student s1)
	{
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);
	}
	public static void main(String[] args) 
	{
		StudentDemo sd=new StudentDemo();
		Student s=new Student();
		sd.display(s);
	}
}
