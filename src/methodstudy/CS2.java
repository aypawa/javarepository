package methodstudy;

public class CS2 {

	String city="Pune";
	String name;
	public CS2()
	{
		 name="velocity";
	}
	
	public static void main(String[] args) {

		display1();
		CS2 c2= new CS2();
		c2.display();
		
	}

	public void display()
	{
		System.out.println("I am non static method");
		System.out.println("My city name is "+city);
		System.out.println("My name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("I am static display1 method");
	}
	
	
}
