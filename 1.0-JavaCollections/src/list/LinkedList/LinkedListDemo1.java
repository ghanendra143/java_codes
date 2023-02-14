package list.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList link = new LinkedList(); 
		link.add("Krishna");
		link.add('R');
		link.add(24);
		link.add(21.77);
		link.add(true);
		link.add(null);
		link.add(null);
		
		System.out.println(link);
		
		link.add(3,"Ram");
		System.out.println(link);
		
		LinkedList link2 = new LinkedList();
		link2.addAll(link);
		System.out.println("link2 list : "+link2);
		
		link2.remove(true);
		System.out.println("after removing 'true' : "+link2);
		
		link2.remove(2);
		System.out.println("after removing '24' : "+link2);
		
		link2.removeAll(link);
		System.out.println("removing all elements from link2 : "+link2);
		
		System.out.println("element at index(0) in link : "+link.get(0));
		
		link.set(1, "Rohit");
		System.out.println(link);
		
		// linked list methods
		link.addFirst("prem");
		System.out.println(link);
		
		link.addLast("vikas");
		System.out.println(link);
		
		link.removeFirst();
		System.out.println(link);
		
		link.removeLast();
		System.out.println(link);
		
		System.out.println("first element in link : "+link.getFirst());
		System.out.println("last element in link : "+link.getLast());
		
//		Collections.shuffle(link);
//		System.out.println("shuffle order : "+link);
		
		System.out.println(link);
		
		// iterating data of a linked list : 
		
		// by for loop : 
		System.out.println("\n============ Using for loop ===========");
		for(int i=0;i<link.size();i++) {
			System.out.println(link.get(i));
		}
		
		// for each loop : 
		System.out.println("\n======== iterating using for each loop ==========");
		for(Object e:link) {
			System.out.println(e);
		}
		
		// iterator 
		System.out.println("\n======== iterating using iterator ==========");
		Iterator itr = link.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
