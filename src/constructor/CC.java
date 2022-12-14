package constructor;

public  class CC {

	int a;
	int b;
	
	public CC()
	{
		System.out.println("Hi I am constructor");
		a=10;
		b=20;
	}
	

	public static void main(String[] args) {

		CC c = new CC();
		c.test();
	}

	public void test()
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
}
