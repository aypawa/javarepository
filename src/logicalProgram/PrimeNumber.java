package logicalProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=11;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1)
		{
			System.out.println("Entered number "+num+" is not prime number");
		}
		else
		{
			System.out.println("Entered number is prime number");
		}

	}

}
