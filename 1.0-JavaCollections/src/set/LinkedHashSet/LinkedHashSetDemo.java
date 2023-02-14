package set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(12);
		lhs.add(56);
		lhs.add(23);
		lhs.add(78);
		lhs.add(99);
		lhs.add(16);
		
		// insertion order is preserved : 
		System.out.println(lhs);
		
		lhs.stream().forEach(System.out::println);

	}

}
