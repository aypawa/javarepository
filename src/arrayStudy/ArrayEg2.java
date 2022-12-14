package arrayStudy;

import java.util.Arrays;

public class ArrayEg2 {

	public static void main(String[] args) {

		String name[]={"Sachin", "Virendra","Rahul","Virat","Yuvraj"};
		
		int rollNum[]= {60,10,40,30,50,20};
		
		System.out.println("===================");
		System.out.println("Original order");
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("======================");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("=========================");
		System.out.println("SORTED ARRAY ----ascending order");
		
		Arrays.sort(rollNum);
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("=====================");
		System.out.println("SORTED ARRAY----------descending order");
		
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("===========================");
		
		
		
		
		
		
	}

}
