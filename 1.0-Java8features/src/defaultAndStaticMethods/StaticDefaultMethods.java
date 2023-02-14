package defaultAndStaticMethods;

public interface StaticDefaultMethods {
	
	public void sum(int a,int b);
	
	static void mul(int a, int b) {
		System.out.println("multiply is : "+a*b);
	}
	
	default void print() {
		System.out.println("hello everyone!!");
	}

	default void sub(int a, int b) {
		System.out.println("subtraction is : "+(a-b));
	}
}
