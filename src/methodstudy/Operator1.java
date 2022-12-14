package methodstudy;

public class Operator1 {

	public static void main(String[] args) {

		addition(20,30);
		substraction(40,20);
		Operator1 ot=new Operator1();
		ot.multiplication(20,40);
		ot.division(20,10);
	}

	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void substraction(int a, int b)
	{
		int sub=b-a;
		System.out.println("Substraction is "+sub);
	}
	public void multiplication(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	public void division(int a,int b)
	{
		int div=b/a;
		System.out.println("Division is "+div);
	}
	
	
	
}
