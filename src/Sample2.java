
public class Sample2 {

	public static void main(String[] args) {
		
		StudentInfo("Narayan",10,27,'A','M');
		System.out.println("================");
		StudentInfo("Ajinkya",11,27,'B','M');
		System.out.println("================");
		StudentInfo("Narayan",12,27,'C','M');
		System.out.println("================");
		StudentInfo("Narayan",13,27,'D','M');

	}

	
	public static void StudentInfo(String name,int rollNum,float age,char grade,char gender)
	{
		System.out.println("Student name is :"+name);
		System.out.println("Student rollNum is :"+rollNum);
		System.out.println("Student age is :"+age);
		System.out.println("Student grade is :"+grade);
		System.out.println("Student gender is :"+gender);
		
	}
	
	
}
