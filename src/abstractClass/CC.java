package abstractClass;

public class CC extends Test {
	public void demo1()
	{
		System.out.println("Demo1 completed in CC class");
	}
	
	public void demo3()
	{
		System.out.println("Demo3 is CC's own method ");
	}
	public void demo4() 
	{
		System.out.println("demo4 is completed in CC class");
	}

	public static void main(String[] args) {

		CC c=new CC();
		c.demo1();
		c.demo2();
		c.demo3();
		c.demo4();
		
	
	}
	
	

	
}
