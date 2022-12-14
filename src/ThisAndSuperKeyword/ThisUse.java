package ThisAndSuperKeyword;

public class ThisUse {

	int a=90;
	
	
	public static void main(String[] args) {

		ThisUse t=new ThisUse();
		t.test();
	}

	public void test()
	{
		int a=10;
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of b is "+this.a);
		
		int sum=a+100;
		System.out.println("Sum using local value of a is "+sum);
		
		int sum1=this.a+100;
		System.out.println("Sum using global value of b is "+sum1);
	}
	
}
