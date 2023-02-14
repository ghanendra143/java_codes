package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemos {

	public static void main(String[] args) {
		
		List<String> emp = Arrays.asList("Rahul","abhi","avinash","mukesh","prem"); 
		
//		Ex-1 changing string to upper case :
		emp.stream().map(n->n.toUpperCase()).forEach(p->System.out.println(p));
		
		// Ex-2 find lenght of each value : 
		emp.stream().map(n->n.length()).forEach(p->System.out.println(p));
		
		// Ex-3 take numbers from array and get square of it : 
		List<Integer> num = Arrays.asList(3,6,4,7,9,12,15,8);
		
		num.stream().map(e->e*e).collect(Collectors.toList()).
				forEach(p->System.out.println(p));
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("ghanendra", 40000));
		list.add(new Employee("Arjun", 20000));
		list.add(new Employee("Praveen", 35000));
		list.add(new Employee("farid", 30000));
		list.add(new Employee("Rohan", 25000));
		list.add(new Employee("Abhi", 10000));
		list.add(new Employee("Prem", 320000));
		
		list.stream().filter(e->e.salary>30000).map(m->m.salary)
		.collect(Collectors.toList()).forEach(p->System.out.println(p));
		
	}

}
