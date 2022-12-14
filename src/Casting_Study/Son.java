package Casting_Study;

public class Son extends Father{

	public static void main(String[] args) {

		Son s=new Son();
		s.car();
		s.bike();
		s.Degree();
	
		Father f=new Son();
		f.bike();
		f.car();
		
		
	}

    public void car()
    {
    	System.out.println("Honda Civic");
    }
    public void bike()
    {
    	System.out.println("JAWA");
    }
	public void Degree()
	{
		System.out.println("BE");
	}
	
	
	
	
	
	
}
