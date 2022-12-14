package method;

public class july23MoringB {

	public static void main(String[] args) {

	july23MoringB jb=new july23MoringB();
	
		jb.StudentInfo();
		
		jb.StudentInfo("Dinesh",23.6f,'M',20);
		jb.StudentInfo("Manisha",22.8f,'F',21);
		jb.StudentInfo("Rahul",23,'M',22);
	}

	public void StudentInfo()
	{
		String name ="Mahesh";
		float age=23.6f;
		char gender='M';
		int rollNum=10;
		
	System.out.println("Student name is "+name);
	System.out.println("Student age is "+age);
	System.out.println("Student gender is "+gender);
	System.out.println("Student rollNum is "+rollNum);
	}
	public void StudentInfo(String name, float age, char gender, int rollNum)
	{
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student gender is "+gender);
        System.out.println("Student rollNum is "+rollNum);      
	}
	
	
	
	
	
	
}
