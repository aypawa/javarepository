package generilzation;

public class Generilzation {

	public static void main(String[] args) {

		EnggClg1 e1=new EnggClg1();
		EnggClg2 e2=new EnggClg2();
		
		e1.exam();
		e1.examPattern();
		e1.examSchedule();
		e1.syllabus();
		e1.results();
		System.out.println("========================");
		e2.exam();
		e2.examPattern();
		e2.examSchedule();
		e2.results();
		
		System.out.println("calling examfees variable "+University.examFees);
	}

}
