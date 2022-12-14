package Interface_Study;

public class ImpClass implements MyInterface {

	public static void main(String[] args) {

		System.out.println("calling static variable from MyInterface class "+a);
		
		ImpClass i=new ImpClass();
		i.m1();
		i.m2();
		i.m3();
	}

	@Override
	public void m1()
	{
     System.out.println("method m1 completed in implementation class");		
	}

	@Override
	public void m2() 
	{
    System.out.println("method m2 completed in implementation class");		
	}

	public void m3()
	{
		System.out.println("method m3 is own method of implementation class");
	}
}
