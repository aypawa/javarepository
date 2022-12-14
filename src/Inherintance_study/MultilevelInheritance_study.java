package Inherintance_study;

public class MultilevelInheritance_study {

	public static void main(String[] args) {

		
		Son s= new Son();
		s.keys();
		s.recipe();
		s.money();
		s.home();
		s.mobile();
		s.laptop();
		
		Mother m=new Mother();
		m.keys();
		m.recipe();
		m.money();
		m.home();
		
		Grandmother g=new Grandmother();
		g.keys();
		g.recipe();
		
		

		
		
		
	}

}
