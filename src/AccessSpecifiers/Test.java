package AccessSpecifiers;

public class Test {

	private int a=10;
	        int b=20;
	protected int c=30;
	public int d=40;
	
	public static void main(String[] args) {

		Test t =new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		System.out.println("============================");
		
		System.out.println("Calling private variable from same class "+t.a);
		System.out.println("Calling default variable from same class "+t.b);
		System.out.println("Calling pretected variable from same class "+t.c);
		System.out.println("Calling public variable from same class "+t.d);
		
		
		
		
	}

	private void m1()
	{
	System.out.println("Private method m1 from test class ");
	}
	
	void m2()
	{
		System.out.println("default method m2 from test class");
	}
	
	protected void m3()
	{
		System.out.println("protected method m3 from test class");
	}
	
	public void m4()
	{
		System.out.println("public method m4 from test class");
	}
	
}
