package javaProgramming;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10;
	    int b=20;
	    System.out.println("Before swapping values are..."+a+" "+b);
	    
	    //logic1-Third variable
	    
//	    int t=a;
//	    a=b;
//	    b=t;
	    
	//    System.out.println("Before swapping values are..."+a+" "+b);
	  
	    //logic 2 -use + &-without using third variable
//	    a=a+b;
//	    b=a-b;
//	    a=a-b;
	    
//	    System.out.println("Before swapping values are..."+a+" "+b);
	    
	    //logic use * and / without using third variable
	    a=a*b;
	    b=a/b;
	    a=a/b;
	    System.out.println("Before swapping values are..."+a+" "+b);
	    
	}

}
