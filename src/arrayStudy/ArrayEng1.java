package arrayStudy;

public class ArrayEng1 {

	public static void main(String[] args) {

		int rollNum[]=new int[10];
		
		rollNum[0]=10;
		rollNum[1]=20;
		rollNum[2]=30;
		rollNum[3]=40;
		rollNum[4]=50;
		rollNum[5]=60;
		
		System.out.println(rollNum[0]);
		System.out.println(rollNum[1]);
		System.out.println(rollNum[2]);
		System.out.println(rollNum[3]);
		System.out.println(rollNum[4]);
		System.out.println(rollNum[5]);
		System.out.println(rollNum[6]);
		
		System.out.println("========================");
		
		String name[]=new String[6];
		
		name[0]="Sachin";
		name[1]="Virendra";
		name[2]="Saurabh";
		name[3]="Rahul";
		name[4]="Yuvraj";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		System.out.println(name[5]);
		
		System.out.println("==========================");
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("==================");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("======================");
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("====================");
		
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===============================");
		
		for(int i:rollNum)
		{
			System.out.println(i);
		}
		System.out.println("=================");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("=====================");
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		System.out.println("===================");
		
		for(String i:name)
		{
			System.out.println(i);
		}
	}

}
