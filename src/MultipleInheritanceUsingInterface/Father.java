package MultipleInheritanceUsingInterface;

public interface Father {

	void care();
	void experience();
      default void love()
	{
		System.out.println("Fathers love");
	}
	static void knowledge()
	{
		System.out.println("Fathers knowledge");
	}
	
	
}
