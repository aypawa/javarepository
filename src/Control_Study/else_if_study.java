package Control_Study;

public class else_if_study {

	public static void main(String[] args) {

		int marks=20;
		
		if(marks>=70) {
			System.out.println("You are in dist.class");
		}
		else if(marks>=60) {
			System.out.println("You got first class");
		}
		else if(marks>=50) {
			System.out.println("You got second class");
		}
		else if(marks>=40) {
			System.out.println("You got third class");
		}
		else {
			System.out.println("You are fail");
		}
	}

}
