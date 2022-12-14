package AccessSpecifiers;

public class Test2 {

	public static void main(String[] args) {

		Test t=new Test();
		t.m2();
		t.m3();
		t.m4();
		System.out.println("==========================");
		
		System.out.println("Calling Default variable from another class "+t.b);
		System.out.println("Calling Protected variable from another class "+t.c);
		System.out.println("Calling Public variable from another class "+t.d);
		
	}

}
