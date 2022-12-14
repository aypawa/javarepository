package method;

public class StaticRegularmethodCall {

	public static void main(String[] args) {

		test1();
		test2();
		test2();
		test1();
		Demo.sample();
		Demo.sample1(); 
		
	}

	public static void test1()
	{
		System.out.println("Hi I am test1 static Regular method");
	}
	public static void test2()
	{
		System.out.println("Hi I am test2 static Regular method");
	}
	
	
	
	
	
}
