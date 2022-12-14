package methodstudy;

public class CC {

	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	
	
public CC()
{
	a=10;
	b=20;
	c=30;
	d=40;
	e=50;
	f=60;
}
	public static void main(String[] args) {

		CC cc=new CC();
		cc.test();
	}

	
	public void test()
	{
		int sum=a+b;
		int sub=d-c;
		int mul=a*e;
		int div=f/a;
		System.out.println("sum is "+sum);
		System.out.println("sub is "+sub);
		System.out.println("mul is "+mul);
		System.out.println("div is "+div);
		
		
		
	}
	
}
