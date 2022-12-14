package methodstudy;

public class CC3 {

	int num1;
	int num2;
	int num3;
	
	public CC3()
	{
		num1=10;
		num2=20;
		num3=30;
	}
	
	public CC3(int a)
	{
		num1=a;
	}
	public CC3(int a, int b)
	{
		 num1=a;
		 num2=b;
	}
	public CC3(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	
	public static void main(String[] args) {

		CC3 c3 = new CC3();;
		c3.addition();
		
		CC3 c4= new CC3(10);
		c4.addition();
		
		CC3 c5=new CC3(20,30);
		c5.addition();
		
		CC3 c6= new CC3(40,50,60);
		c6.addition();
	}

	public void addition()
	{
		int sum=num1+num2+num3;
		System.out.println("Addition is "+sum);
	}
	
	
	
	
}
