package Interface_Study;

public class Child implements Father,Mother{

	public static void main(String[] args) {

		Child c=new Child();
		c.look();
		c.recipe();
		c.money();
		c.property();
	
	}

	@Override
	public void look()
	{
		System.out.println("look method completed by child");
	}

	@Override
	public void recipe()
	{
		System.out.println("recipe method completed by child");
	}

	@Override
	public void money()
	{
		System.out.println("money method is completed by child");
	}

	@Override
	public void property()
	{
		System.out.println("property method is completed by child");
	}

}
