package javaProgramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		//using StringBuffer class
		
	
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println("reverse number is :"+rev);
//		
		//using StringBuilder class
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("reverse number is:"+rev);

	}

}
