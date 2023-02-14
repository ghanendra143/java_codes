package defaultAndStaticMethods;

public interface Student {

	// default method can be override
	default void dMethod() {
		System.out.println("This is a default method");
	}
	
	// static method can't be override
	static void sMethod() {
		System.out.println("This is a static method");
	}
}
