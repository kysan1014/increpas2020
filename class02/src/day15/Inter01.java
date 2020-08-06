package day15;

public interface Inter01 {

	int num = 100; // public static final
	void display(); // public abstract
	
	default void getThis() {
		System.out.println("Implement all these");
	}
	
	
}
