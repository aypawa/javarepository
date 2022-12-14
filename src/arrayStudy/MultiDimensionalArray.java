package arrayStudy;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int rollNum[][]= new int[2][2];
		
		rollNum[0][0]=10;
		rollNum[0][1]=11;
		rollNum[1][0]=12;
		rollNum[1][1]=13;
		
		System.out.println("===================");
		
		System.out.print(rollNum[0][0]+" ");
		System.out.println(rollNum[0][1]);
		System.out.print(rollNum[1][0]+" ");
		System.out.println(rollNum[1][1]);
		
		System.out.println(rollNum.length);
		
		System.out.println("====================");
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			
		for(int j=0;j<=rollNum.length-1;j++)
		{
			System.out.print(rollNum[i][j]+" ");
		}
		System.out.println();
		
		
	}
    System.out.println("======================");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}