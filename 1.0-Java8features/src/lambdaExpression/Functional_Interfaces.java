package lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional_Interfaces {

	public static void main(String[] args) {
		
		// Consumer Interface
//		public interface Consumer<T> {
//			public void accept(T t);
//		}
		
		Consumer<String> str = (e)-> System.out.println(e);
		str.accept("have a good day");
		str.accept("good job!!");
		System.out.println("---------------------------\n");
		
		// Predicate Interface
//		public interface Predicate<T> {
//			public boolean test(T t);
//		}
		Predicate<Integer> check = (n) -> n%2==0;
		System.out.println(check.test(21));
		System.out.println(check.test(22));
		System.out.println("---------------------------\n");
		
		// Supplier interface
//		public interface Supplier<String> {
//			public String get();
//		}
		
		Supplier<String> str2 = ()-> "good afternoon everyone!!";
		System.out.println(str2.get());
	
		
	}

}
