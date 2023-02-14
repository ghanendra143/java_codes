package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OtherMethods {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,2,4,6,5,9,7,0);
		
		// sorted() method :
		
		// ---------------in asecnding order-------------
//		list.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		// ---------------in descending order :----------- 
//		list.stream().sorted((a,b)->Integer.compare(b, a)).collect(Collectors.toList())
//		.forEach(s->System.out.println(s));
		
		list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
		.forEach(s->System.out.println(s));
		
		// sorting in strings : 
		List<String> str = Arrays.asList("rahul","abhi","yash","divya","kiran","pankaj","akki");
		
		// sorting List<String> in ascending order : 
		str.stream().sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		// sorting List<string> in descending order : 
		str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
		.forEach(s->System.out.println(s));	
	}
}
