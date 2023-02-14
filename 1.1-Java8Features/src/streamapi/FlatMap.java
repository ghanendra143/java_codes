package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		// Ex-1  adding 1 in all elememts of list1
		// by using map
		List<Integer> list1 = Arrays.asList(4,3,6,8,9,2,7);
		list1.stream().map(e->e+1).forEach(p->System.out.println(p));
		
		// adding list2+list3+list4+list5 into finallist 
		// by using flatMap
		
		// flatMap accepts stream and returns also stream
		
		List<Integer> list2 = Arrays.asList(3,6,4);
		List<Integer> list3 = Arrays.asList(9,2,7);
		List<Integer> list4 = Arrays.asList(4,3,6,5);
		List<Integer> list5 = Arrays.asList(8,9,2,3);
		
		List<List<Integer>> finalList = Arrays.asList(list2,list3,list4,list5);
		finalList.stream().flatMap(x->x.stream()).
		collect(Collectors.toList()).forEach(p->System.out.println(p));
	}

}
