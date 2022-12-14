package HierarchicalInheritanceUsingInterface;

public class Test1 implements Sample {

	public static void main(String[] args) {

		Test1 t=new Test1();
		t.demo();
		t.test();
	}

	@Override
	public void demo() 
	{
		System.out.println("this is demo method in sample interface ");
	}

	@Override
	public void test() 
	{
		System.out.println("this is test method in sample interface");
	}

}
