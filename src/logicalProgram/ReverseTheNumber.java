package logicalProgram;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		String original = Integer.toString(number);
		
		for(int i=original.length()-1;i>=0;i--)
		{
			char t=original.charAt(i);
			rev=rev+t;
		}
//		System.out.println("Original string is "+original);
//		System.out.println("Reverse string is "+rev);
		
		 int newNum = Integer.parseInt(rev);
		 System.out.println("Original number is "+original);
		 System.out.println("Reverse number is "+newNum);
		
	}

}
