package logicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
		int c=a+b;
		System.out.println("value of c is "+c);
		
	    System.out.println("Enter the name");
	    String name = sc.next();
	    System.out.println("my name is "+name);
	}

}
