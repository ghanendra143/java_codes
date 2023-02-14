package set.HashSet;

import java.util.HashSet;
import java.util.stream.Collectors;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> num = new HashSet<Integer>();
		
		num.add(12);
		num.add(11);
		num.add(79);
		num.add(22);
		num.add(34);
		num.add(97);
		
		System.out.println("num : "+num);
		
		// filtering even numbers : 
//		num.stream()
//			.filter((e)->e%2==0)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		HashSet<Integer> num2 = new HashSet<Integer>();
		num2.add(34);
		num2.add(10);
		num2.add(22);
		num2.add(54);
		
		System.out.println("num2 : "+num2);
		
		// union 
		num.addAll(num2);
		System.out.println("union : "+num);
		
		// intersection
//		num.retainAll(num2);
//		System.out.println("common elements : "+num);
		
		// difference 
//		num.removeAll(num2);
//		System.out.println("difference : "+num);
		
		// subset 
		System.out.println("subset : "+num.containsAll(num2));

	}

}
