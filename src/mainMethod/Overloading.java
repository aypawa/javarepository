package mainMethod;

public class Overloading {

	public static void main(String[] args) {
		main(10,20);
		main();
	}

	public static void main(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of a & b is "+c);
	}
	public static void main()
	{
		System.out.println("Eclipse is running");
	}
}
