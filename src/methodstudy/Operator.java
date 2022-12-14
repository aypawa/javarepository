package methodstudy;

public class Operator {

	public static void main(String[] args) {

		Operator ot= new Operator();
		ot.StudentInfo("Ajinkya",27.6f,'M',5.6f);
		ot.StudentInfo("Amithesh",18.6f,'M',5.7f);
		ot.StudentInfo("Aniket",22.5f,'M',5.9f);
		
		addition(20,30);
		substraction(30,20);
		multiplication(20,30);
		division(40,20);
		
	}

	public void StudentInfo(String name, float age, char gender, float height)
	{
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My height is "+height);
	}
	
	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Hi I am sum is "+sum);
	}
	public static void substraction(long a, long b)
	{
		long sub=b-a;
		System.out.println("Hi I am sub is "+sub);
	}
	public static void multiplication(long a, long b)
	{
		long mul=a*b;
		System.out.println("Hi am mul is "+mul);
	}
	public static void division(int a,int b)
	{
		int div=b/a;
		System.out.println("Hi am div is "+div);
	}
	
}
