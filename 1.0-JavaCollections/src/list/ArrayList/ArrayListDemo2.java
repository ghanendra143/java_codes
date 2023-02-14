package list.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		// declaring ArrayList for storing homogenous data
				List<Integer> num = new ArrayList<Integer>();
				num.add(21);
				num.add(60);
				num.add(11);
				num.add(7);
				num.add(20);
				num.add(12);
				
				System.out.println(num);
				System.out.println(num.getClass());
				
		// 	sorting in ascending order : 
				Collections.sort(num);
				System.out.println("after sorting : "+num);
				
		// sorting in descnding order : 
				Collections.sort(num, Collections.reverseOrder());
				System.out.println("in reverse order : "+num);
				
		// suffle array list : 
				Collections.shuffle(num);
				System.out.println("shuffle : "+num);
			
		// filter even numbers from the array : 
		// using Strea API
		System.out.println("\neven numbers are : ");
		num.stream()
			.filter((e)-> e%2==0)
			.forEach(System.out::println);
	}
}
