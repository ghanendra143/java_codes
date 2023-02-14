package map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// taking inputs from user :
//		int r = 0;
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("enter map size : ");
//		r = sc.nextInt();
//		
//		HashMap<Integer, String> map = new HashMap<>(r);
//		for(int i=0;i<r;i++) {
//			System.out.print("enter key : ");
//			int key = sc.nextInt();
//			System.out.print("enter value : ");
//			String val = sc.next();
//			map.put(key, val);
//		}
//		System.out.println(map);

		HashMap<Integer, String> m = new HashMap();
		m.put(1, "rahul");
		m.put(2, "raj");
		m.put(3, "kajal");
		m.put(4, "priya");
		m.put(5, "yash");

		System.out.println(m);

//		for(int i=1;i<=m.size();i++) {
//			System.out.println(i+". "+m.get(i));
//		}

		// get() --> returns value as per the key
		System.out.println(m.get(2));

		// remove() --> deletes entire entry
		m.remove(5);
		System.out.println("after deleting : " + m);

		// containsKey() -> checks particular key is present or not
		System.out.println("contains key '2'? : " + m.containsKey(2));

		// containsValue() -> checks particular value is present or not
		System.out.println("contains value 'rahul'? : " + m.containsValue("rahul"));

		// isEmpty() -> checks map is empty or not
		System.out.println("is map empty? : " + m.isEmpty());

		// iterates values from the map :
		System.out.println(m.values());

		// keySet() -> returns key set of the map :
		System.out.println("key set : " + m.keySet());

		// returns entry set :
		System.out.println(m.entrySet());

		// copying all entries from m to m2 :
		HashMap<Integer, String> m2 = new HashMap();
		m2.putAll(m);
		System.out.println(m2);

		// clear() -> deleting all entries from m2 :
		m2.clear();
		System.out.println(m2);

		System.out.println("all values of map : ");
		for (Object o : m.values()) {
			System.out.println(o);
		}

		System.out.println("\nall keys of map : ");
		for (int o : m.keySet()) {
			System.out.println(o);
		}

		// getting key value pair together :
		System.out.println("\nkey value pairs : ");
		for (Object o : m.keySet()) {
			System.out.println(o + "--" + m.get(o));
		}

		// Entry methods :
		System.out.println("\n========== Key Value Pairs ===========");
		for (Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

		// ieterator :
		System.out.println("\n----------by iterator--------------");
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}

		System.out.println("\n-------------- by user input : --------------");

		HashMap<String, String> cc = new HashMap<String, String>();

		// Add keys and values (Country, City)
		cc.put("England", "London");
		cc.put("Germany", "Berlin");
		cc.put("Norway", "Oslo");
		cc.put("USA", "Washington DC");
		System.out.println(cc);

		System.out.println("\n1.Capital By Country \n"
						   + "2.Country By Capital \n");

		System.out.print("Enter your Choice : ");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.print("Enter Country name : ");
			String country_name = sc.next();
			for (Map.Entry<String, String> entry : cc.entrySet()) {
				if (entry.getKey().equalsIgnoreCase(country_name)) {
					System.out.println("Capital of " + entry.getKey() + " is " + entry.getValue());
					break;
				} else {
					System.out.println("invalid option1");
					break;
				}
			}
		}

		else if (choice == 2) {
			System.out.print("Enter Capital name : ");
			String capital_name = sc.next();
			for (Map.Entry<String, String> entry : cc.entrySet()) {
				if (entry.getValue().equalsIgnoreCase(capital_name)) {
					System.out.println(entry.getValue() + " is Capital of " + entry.getKey());
					break;
				} else {
					System.out.println("invalid option2");
					break;
				}
			}
		} else {
			System.out.println("invalid option3");
		}
	}
}
