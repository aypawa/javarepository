package MultipleInheritanceUsingInterface;

public interface Mother {

	void nature();
	void look();
	
	default void love()
	{
		System.out.println("Mothers love");
	}
	static void knowledge()
	{
		System.out.println("Mothers knowledge");
	}
}
