package list.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector vc = new Vector(12);
		vc.add("rahul");
		vc.add(12);
		vc.add(true);
		vc.add(null);
		vc.add(12.09);
		vc.add('a');
		
		System.out.println(vc);
		
		Vector vc2 = new Vector();
		// adding all elements in vc2 from vc
		vc2.addAll(vc);
		System.out.println("vc2 : "+vc2);
		
		// adding "vivek" in vc
		vc.addElement("vivek");
		System.out.println("vc after adding vivek : "+vc);
		
		// initial size of vc
		System.out.println("vc capacity : "+vc.capacity());
		
		// creating clone of vc2 : 
		System.out.println("vc2 clone : "+vc2.clone());
		
		// deleting all elements from vc2
		vc2.clear();
		System.out.println("deleting all elements of vc2 : "+vc2);
		
		// getting element at 
		System.out.println("element at index(2) : "+vc.elementAt(2));
		
		// It returns an enumeration of the components of a vector.
		Enumeration en = vc.elements();
		while(en.hasMoreElements()) {
			System.out.println("element of vc : "+en.nextElement());
		}
		
		// getting element at index(0) : 
		System.out.println("element at index(0) : "+vc.get(0));
		
		// getting index of an element : 
		System.out.println("index of the element 'vivek' : "+vc.indexOf("vivek"));
		
		// inserting element at a specific index : 
		vc.insertElementAt(false, 3);
		System.out.println("insertng false at index(3) in vc : "+vc);
		
		// copying from vc to vc2
		vc2 = (Vector) vc.clone();
		System.out.println("inserting in vc2 from vc : "+vc2);
		
		// removing elements from a specific index : 
		vc.remove(4);
		System.out.println("after removing : "+vc);
		
		// remove all elements : 
//		vc2.removeAll(vc);
		System.out.println(vc2);
		
		// checks all elements contains or not
		System.out.println(vc2.containsAll(vc));
		
		// vector to string conversion : 
		String str = vc.toString();
		System.out.println("vector to string conversion : "+str);
		
		for(int i=0;i<vc.size();i++) {
			System.out.println("element : "+vc.get(i));
		}
		
		System.out.println("++++++++++++++++++++++++++");
		for(Object o:vc) {
			System.out.println(o);
		}
		
		System.out.println("++++++++++++++++++++++++++");
		Iterator itr = vc.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
