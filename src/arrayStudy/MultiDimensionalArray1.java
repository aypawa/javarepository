package arrayStudy;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {

		String name[][]= {{"Sachin","Virendra","Virat"},{"Rahul","Saurabh","Rohit"}};
		
		char test[][]= {{'a','b'},{'c','d'},{'e','f'}};
		
		System.out.println(name.length);
		
		
		for(int i=0;i<=name.length-1;i++)
		{
		
			for(int j=0;j<=2;j++)
			{
			System.out.print(name[i][j]+" ");
		}
			System.out.println();

	

}
} }