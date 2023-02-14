package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		
		// terminal operations : collect(),count(),forEach(),min(),max(),reduce(),toArray()
		
		// non terminal operations : filter(),map(),flatMap(),distinct(),limit() --> all these returns stream.
		
		// 1. distinct method :
		List<String> names = Arrays.asList("Rahul","ghanendra","prem","kishan","priya","prem","rahul");
		names.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList())
		.stream().map(e->e.toLowerCase()).forEach(n->System.out.println(n));
		
		// 2. count method
		int total = (int)names.stream().distinct().count();
		System.out.println(total);
		
		// 3. limit method
		names.stream().limit(4).collect(Collectors.toList()).forEach(n->System.out.println(n));
		
		// Ex-1 print only those names having length greater then 5
		System.out.println("\n------names having length above 5 ----------");
		names.stream().filter(n->n.length()>5).collect(Collectors.toList()).forEach(s->System.out.println(s));

		
		List<Integer> num = Arrays.asList(1,4,2,5,7,8,3,9,0);
		
		// 4. min() & max() method : 
		Optional<Integer> mini = num.stream().min((a,b)->Integer.compare(a, b));
		System.out.println("minimum value : "+mini.get());
		
		num.stream().max((a,b)->Integer.compare(a, b)).stream().forEach(n->System.out.println("max value : "+n));
		
		// 5. reduce method (combined different values into a single vallue) : 
		List<String> str = Arrays.asList("A","F","3","G","1","P","56");
		System.out.println(str.stream().reduce((a,b)->a+b).get());
		
		// 6. toArray method : 
		Object arr[] = str.stream().toArray();
		System.out.println(arr.length);
		
		for(Object e:arr) {
			System.out.println(e);
		}	
	}
}
