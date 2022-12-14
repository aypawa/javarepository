package typesofVariables;

public class Employee {


		String emp_name;
		int emp_id;
		float emp_sal;
		String emp_desg;
		char emp_gender;
		static String team="IND";
		
		public void emp_Info()
		{
			System.out.println("Employee name is "+emp_name);
			System.out.println("Employee id is "+emp_id);
			System.out.println("Employee salary is "+emp_sal);
			System.out.println("Employee gender is "+emp_gender);
			System.out.println("Employee designation is "+emp_desg);
			System.out.println("Emplyee team is "+team);
		}
		
		
		
	}


