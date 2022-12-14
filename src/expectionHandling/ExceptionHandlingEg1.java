package expectionHandling;

public class ExceptionHandlingEg1 {

	public static void main(String[] args) {
		
		int i=10;
		int j=0;
		int k=0;
		
		System.out.println("before exception");
		try 
		{
			 k=i/j;
			
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer catch block is running");
		}
//		catch(ArithmeticException e)
//	    {
//			System.out.println(e.getMessage());
//			System.out.println("Arithmatic exception is running");
//			k=2;
//	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException is running");
		}
		catch(Exception e)
		{
			System.out.println("exception catch block is running");
		}
		finally
		{
			System.out.println("finally block is running");
		}
		System.out.println("After exception");
		System.out.println(k);
		
	
	
	
	}
	
	

}
