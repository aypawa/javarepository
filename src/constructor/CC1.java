package constructor;

public class CC1 {

	int a;
	int b;
	int c;
	int p;
	int q;
	int r;
	int s;
	int t;
	 
	
	public CC1()
	{
		a=10;
		b=30;
		c=40;
		p=60;
		q=80;
		r=100;
		s=120;
		t=140;
	}
	public static void main(String[] args) {

		CC1 cc = new CC1();
		cc.test();
		
	}

	
	public void test()
	{
		int sum=a+b;
		int sub=p-c;
		int mul=q*r;
		int div=s/t;
		
		System.out.println("Addition is "+sum);
		System.out.println("Substraction is "+sub);
		System.out.println("Multiplication is "+mul);
		System.out.println("Division is "+div);
	}
	
	
	
	
	
	
	
}
