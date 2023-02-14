package map.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> stud = new Hashtable();
		stud.put(1, "rahul");
		stud.put(2, "riya");
		stud.put(3, "raju");
		stud.put(4, "abhi");
		stud.put(5, "kajal");
		
		System.out.println(stud);
		
		// getting value by key :
		System.out.println(stud.get(2));
		
		// iterating valiue of map : 
		Set s = stud.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			// System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		System.out.println("t/f : "+stud.containsKey(1));
		System.out.println("t/f : "+stud.containsValue("rahul"));
		
		System.out.println("=========================");
		for(Object o:stud.keySet()) {
			System.out.println(o+"--"+stud.get(o));
		}
		
		System.out.println(stud.keySet());
		System.out.println("------------------");
		System.out.println(stud.values());
		
//		System.out.println("1. get name by rollno\n"
//						  +"2. get roll no by name");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("enter your choice : ");
//		int choice = sc.nextInt();
//		
//		switch(choice) {
//		case 1:
//			System.out.println("enter rollno : ");
//			int rollno = sc.nextInt();
//			System.out.println("roll no is : "+rollno+"\nname is : "+stud.get(rollno));
//			break;
//			
//		case 2:
//			System.out.println("enter name to view rollno : ");
//			String name = sc.next();
//			
//			for(Integer e:stud.keySet()) {
//				if(name.equalsIgnoreCase(stud.get(e))) {
//					System.out.println("rollno is : "+e+"\nname is : "+name);
//				}
//			}	
//			break;
//		default : 
//			System.out.println("invalid option!!");
//		}	
	}
}
