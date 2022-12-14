package method;

public class NonstaticRegularMethodCall {

	public static void main(String[] args) {

		NonstaticRegularMethodCall nrm=new NonstaticRegularMethodCall();
		nrm.myMethod1();
		nrm.myMethod2();
	}

	public void myMethod1()
	{
		System.out.println("Hi I am non-static myMethod1 from same class ");
	}
	public void myMethod2()
	{
		System.out.println("Hi I am non-static myMethod2 from same class");
	}
	
	
	
	
}
