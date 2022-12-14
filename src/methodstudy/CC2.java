package methodstudy;

public class CC2 {
	
	int a;
	int b;
	
	public CC2()
	{
		a=90;
		b=10;
	}
	public CC2(int num1)
	{
		a=num1;
	}
	public CC2(int num1, int num2)
	{
		int a=num1;
		int b=num2;
	}
	public static void main(String[] args) {

		CC2 c2=new CC2();
		c2.Addition();
		
		CC2 c3= new CC2(20);
		c3.Addition();
		
		CC2 c4= new CC2(50,60);
		c4.Addition();
	}

	
	public void Addition()
	{
		int add=a+b;
		System.out.println("Addition is "+add);
	}
	
	
	
}
