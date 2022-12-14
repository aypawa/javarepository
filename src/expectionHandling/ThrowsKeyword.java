package expectionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {
		
//		ThrowsKeyword th=new ThrowsKeyword();
//		th.m1();
		System.out.println("Before thread sleep");
		Thread.sleep(5000);
		System.out.println("After thread sleep");
	}
	
	public void m1() throws FileNotFoundException
	{
        System.out.println("Before exception line");
		
		FileInputStream file=new FileInputStream("C:\\Users\\ajink\\OneDrive\\Pictures");

	}

}
