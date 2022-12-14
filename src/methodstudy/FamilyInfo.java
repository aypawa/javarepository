package methodstudy;

public class FamilyInfo {

	public static void main(String[] args) {

		FamilyInfo fi =new FamilyInfo();
		fi.member();
		fi.member("Amithesh",20,'M',9421);
		fi.member("Sumit",21,'M',8418);
		fi.member("Chiku",7,'M',16);
		fi.member("Atharv",21,'M',8668);
	}

	public void member()
	{
		String name= "Ajinkya";
		float age=    27.6f;
		char gender='M';
	    int  MoNum=1081;
		
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My mobile number is "+MoNum);
	}

	public void member(String name, float age, char gender, int MoNum)
	{
		System.out.println("My name is "+name);
	    System.out.println("My age is "+age);
	    System.out.println("My gender is "+gender);
	    System.out.println("My mobile number is "+MoNum);
	    
	}
	
	
}

