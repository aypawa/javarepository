package ThisAndSuperKeyword;

public class B extends A{

	int x=30;
	int y=40;
	
	public static void main(String[] args) {

		B b=new B();
		b.test();
		
	}

	public void test()
	{
		int x=50;
		System.out.println("Local value of x is "+x);
		System.out.println("Global value of x is "+this.x);
		System.out.println("Global value of y is "+this.y);
		System.out.println("Global value of x from super class A is "+super.x);
		System.out.println("Global value of y from super class B is "+super.y);
		
	}
}
