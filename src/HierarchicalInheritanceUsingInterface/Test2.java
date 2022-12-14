package HierarchicalInheritanceUsingInterface;

public class Test2 implements Sample {

	public static void main(String[] args) {

		Test2 t=new Test2();
		t.demo();
		t.test();
	}

	@Override
	public void demo()
	{
		System.out.println("this is demo method taken from super class");
	}

	@Override
	public void test()
	{
		System.out.println("this is test method taken from super class");
	}

}
