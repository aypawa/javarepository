package typesofVariables;

public class GlobalAndLocalvariable {

	int a=80;
	static int b=20;
	
	public static void main(String[] args) {

		Addition();
		
		GlobalAndLocalvariable gl=new GlobalAndLocalvariable();
		gl.substraction();
		
		System.out.println("usage of non static global variable "+gl.a);
		
		System.out.println("usage of static global variable "+b);
		
		int mul=10*gl.a;
		System.out.println("multiplication is "+mul);
		
		int div=100/b;
		System.out.println("Division is "+div);
		
		
		Test t=new Test();
		System.out.println("Calling non static global variable from another class "+t.x);
		
		int mul1=20*t.x;
		System.out.println("Multiplication is "+mul1);
		
		
		System.out.println("Calling static global variable from another class "+Test.y);
		
		int div1=150/Test.y;
	}

public static void Addition()
{
	int a=70;
	int b=30;
	int sum=a+b;
	System.out.println("Addition of a & b is "+sum);
    
	GlobalAndLocalvariable gl=new GlobalAndLocalvariable();//calling global variable in the method
   System.out.println("Calling global variable in the method "+gl.a);
	
	
}

public void substraction()
{
	int c=50;
	int d=30;
	int sub=d-c;
	System.out.println("Substraction of c & d is "+sub);
	System.out.println("calling global variable from same class "+this.b);
	 
}

}







