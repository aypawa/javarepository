package logicalProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String original = sc.next();
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			char t=original.charAt(i);
			rev=rev+t;
		}
		System.out.println("original string is "+original);
		System.out.println("Reverse string is "+rev);

		if(original.equals(rev))
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not palindrome");
		}
	}

}
