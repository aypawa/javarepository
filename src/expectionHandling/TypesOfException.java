package expectionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfException {

	public static void main(String[] args) {
		
        //ArrayIndexOutOfBoundException		
//		int []a=new int[5];
//		
//		a[6]=50;
//		System.out.println(a[6]);

		//NullPointerException
	//	String s=null;
		
//		int ss = s.length();
//		System.out.println(ss);
		
		//FileNotFoundException
//		String path="C:\\Users\\ajink\\OneDrive\\";
//		try {
//		FileInputStream file=new FileInputStream(path);
//		System.out.println("path is correct");
//		}
//		catch(FileNotFoundException e)
//		{
//			System.out.println("file not found please check");
//		}
		
		System.out.println("before sleep");
		
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occur");
		}
		System.out.println("After sleep");
		
		
	}

}
