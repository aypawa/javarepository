package MultipleInheritanceUsingInterface;

public class Son implements Father,Mother{

	public static void main(String[] args) {

		Son s=new Son();
		s.look();
		s.nature();
		s.experience();
		s.care();
		s.love();
		
		
		Father.knowledge();
		Mother.knowledge();
		
	}

	@Override
	public void nature() 
	{
		System.out.println("nature method from mother");
	}

	@Override
	public void look() 
	{
		System.out.println("look method from mother");
	}

	@Override
	public void care() 
	{
		System.out.println("care method from father");
	}

	@Override
	public void experience() 
	{
		System.out.println("experience method from father");
	
	}

	public void love()
	{
		Mother.super.love();
		Father.super.love();
		
	}
	
	
}
