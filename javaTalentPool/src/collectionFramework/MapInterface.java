package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class MapInterface {

	public static void main(String[] args) {
		
		// ============= 3.Map ====================
		// =============== 3.1-HashMap =================================
		HashMap<Integer,String> st = new HashMap<>(); 
		st.put(1, "rahul");
		st.put(2, "rohit");
		st.put(3, "raj");
		st.put(4, "rajat");
		st.put(5, "raju");
		System.out.println(st);
		Scanner sc = new Scanner(System.in);
		
		Set s = st.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			Map.Entry ent = (Entry) itr.next();
//			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(ent.getKey() + " -- " + ent.getValue());
		}
		
//		System.out.println("enter your choice : ");
//		System.out.println("1. enter sr.no to get name." + "\n" +
//						   "2. enter name to get sr.no");
//		System.out.print("enter your choice : ");
//		int choice = sc.nextInt();
//		switch(choice)
//		{
//			case 1:
//			System.out.print("enter sr.no : ");
//			int num = sc.nextInt();
//			System.out.println(st.get(num));
//			break;
//			
//			case 2:
//			System.out.print("enter name : ");
//			String name = sc.next();
//			for(Integer e:st.keySet())
//			{
//				if(name.equalsIgnoreCase(st.get(e)))
//				{
//					System.out.println(e);
//				}
//				// System.out.println(e + " " + st.get(e));
//			}
//		}
	}

}
