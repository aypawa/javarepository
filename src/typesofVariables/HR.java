package typesofVariables;

public class HR {

	public static void main(String[] args) {

		Employee sachin= new Employee();
		sachin.emp_name="Sachin T";
		sachin.emp_id=123;
		sachin.emp_gender='M';
		sachin.emp_sal=123.5f;
		sachin.emp_desg="QA";
		
		sachin.emp_Info();
	
	Employee virendra=new Employee();

	virendra.emp_name="Viru";
	virendra.emp_id=678;
	virendra.emp_gender='f';
	virendra.emp_sal=4567.12f;
	virendra.emp_desg="QC";
	
	virendra.emp_Info();
			

	}
}
