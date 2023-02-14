package list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemos {

	public static void main(String[] args) {
		
		// declaring ArrayList for storing hetrogenous data
		ArrayList list = new ArrayList();
		
		list.add("rahul");
		list.add(23);
		list.add(78.99);
		list.add('a');
		list.add(true);
		
		System.out.println(list+"\n");
		
		// size of array
		System.out.println("size of array is : "+list.size());
		
		// remove element
		list.remove(2);
		System.out.println("after removing : "+list);
		
		// adding element as per the index value
		list.add(2, 78.88);
		System.out.println("after inserting element : "+list);
		
		// getting value by index
		System.out.println("value at index(1) is : "+list.get(1));
		
		// setting value by index : 
		list.set(4, false);
		System.out.println("setting value at index(4) : "+list);
		
		// is contains or not (returns true/false)
		System.out.println(list.contains("rahul"));

		// check isEmpty()
		System.out.println(list.isEmpty());
		
		// fetching data of the array list
		System.out.println("\n===================== fetching data from array =======================");
		
		// 1. for loop
		System.out.println("----------- by for loop ------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// 2. for each loop
		System.out.println("----------- by for each loop ------------");
		for (Object e : list) {
			System.out.println(e);
		}
		
		// 3. by iterator 
		System.out.println("----------- by iterator ------------");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 4. iterating list by using lambda expression
		System.out.println("----------- by lambda expression ------------");
		list.stream().forEach((e)->System.out.println(e));
		
		ArrayList duplicateList = new ArrayList();
		duplicateList.addAll(list);
		System.out.println(duplicateList);
		
		duplicateList.removeAll(list);
		System.out.println("after removing : "+duplicateList);
		
	}

}
