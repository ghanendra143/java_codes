package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	public static void main(String[] args) {
		
		       // ============= 1.Set =============
		
//============================ 1.1-Array List ===============================================
	// 1. ArrayList 
//	List<String> list = new ArrayList<String>();
//	list.add("zebra");
//	list.add("raj");
//	list.add("rajesh");
//	list.add("rajesh");
//	list.set(1, "ghanendra");   // set value at index 1
//	System.out.println(list);
//	Collections.sort(list);    // sort in alphabetically work same for integers also
//	list.remove(3); // to remove objects by index and name both
//	System.out.println(list);
	
	
//	iterating using for loop
//	for(int i=0;i<list.size();i++)
//	{
//		System.out.println(list.get(i));
//	}
	
	// iterating using for each loop
//	for(String l:list)
//	{
//		System.out.println(l);
//	}
	
//	======================= ARRAY =======================================
//	Scanner sc = new Scanner(System.in);
//	System.out.print("enter size of array : ");
//	int size = sc.nextInt();
//	String[] arr = new String[size];
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.print("enter value"+ (i+1) +" : ");
//		arr[i] = sc.next();
//	}
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.println(arr[i]);
//	}
//	for(String e:arr)
//	{
//		System.out.println(e);
//	}

	// ======================== 1.2-Linked List ==============================================
//	List<String> list = new LinkedList<String>();
//	list.add("bmw");
//	list.add("audi");
//	list.add("volvo");
//	list.add("jaguar");
//	list.remove(2);
//	Collections.reverse(list);
//	System.out.println(list);
//	Iterator<String> itr = list.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
//	for(String e:list)
//	{
//		System.out.println(e);
//	}
	
// ========================= 1.3-Vector ===========================================	
//		List<String> list = new Vector<String>();
//		list.add("ford");
//		list.add("bmw");
//		list.add("audi");
//		list.add("maruti");
//		for(String v:list)
//		{
//			System.out.println(v);
//		}

// =========================== 1.4-Stack ===========================================		
	Stack<String> st = new Stack<String>();
	// we can use both add and push to insert the objects
	st.add("rahul");
	st.add("raju");
	st.push("ramesh");
	st.push("raka");
	st.pop();
	for(String s:st)
	{
		System.out.print("--" + s);
	}

	}
}
