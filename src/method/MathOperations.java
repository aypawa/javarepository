package method;

public class MathOperations {

	public static void main(String[] args) {

		addition();
		MathOperations mo =new MathOperations();
		mo.substraction();
		MyClass.multiplication();
		MyClass mc =new MyClass();
	    mc.division();
		
	}

	public static void addition()
	{
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	
	public void substraction()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Substraction is "+sub);
	}
	
	
	
	
	
	
	
	
	
	
	
}
