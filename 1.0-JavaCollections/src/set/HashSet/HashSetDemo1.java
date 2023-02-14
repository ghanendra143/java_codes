package set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
//		HashSet hs3 = new HashSet(100, (float)0.90);    // 100 = capacity, 0.90 = load factor

		hs.add(123);
		hs.add("rahul");
		hs.add(null);
		hs.add(12.67);
		hs.add('A');
		
		System.out.println("hs : "+hs);
		
		HashSet hs2 = new HashSet();
		hs2.addAll(hs);
		
		System.out.println("hs2 : "+hs2);
		
		// contains all 
		System.out.println(hs2.containsAll(hs));
		
		// remove : 
		hs.remove(null);
		System.out.println("after removing 'null' : "+hs);
		
		// remove all
		hs2.removeAll(hs2);
		System.out.println("after removing hs2 : "+hs2);
		
		// contains
		System.out.println(hs.contains("rahul"));
		
		// is empty
		System.out.println(""+hs2.isEmpty());
		System.out.println("\n");
		
		// iterating values of hs
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================\n");
		
		// reading values by for each loop
		for(Object o:hs) {
			System.out.println(o);
		}
		System.out.println("====================\n");
	
	}
}
