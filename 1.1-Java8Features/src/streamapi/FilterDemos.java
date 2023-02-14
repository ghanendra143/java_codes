package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String empName;
	int salary;
	
	Employee(String name, int sal){
		this.empName=name;
		this.salary=sal;
	}
}

public class FilterDemos {

	public static void main(String[] args) {
		
		// Ex-1 filtering even numbers from the list : 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(17);
		list.add(23);
		list.add(11);
		list.add(40);
		
		List<Integer> evenlist = new ArrayList<Integer>();
		evenlist = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evenlist);
		
		
		// Ex-2  filtering names greater then 5 characters : 
		List<String> names = Arrays.asList("rahul","binod","prem","ghanendra","christopher","jeny");
		List<String> bignames = names.stream().filter(i->i.length()>5).collect(Collectors.toList());
		System.out.println(bignames);
		
		// Ex-3 filtering null values from the list : 
		List<String> words = Arrays.asList(null,"rahul",null,"prem","21231","kiran",null,"king");
		System.out.println(words);
		List<String> fw = words.stream().filter(i->i!=null).collect(Collectors.toList());
		System.out.println(fw);
		
		// Ex-4 printing emp name and salary above 25000
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("rahul",56000));
		emplist.add(new Employee("rohit",43000));
		emplist.add(new Employee("prem",16000));
		emplist.add(new Employee("vikas",38000));
		emplist.add(new Employee("yash",22000));
		emplist.add(new Employee("farid",36000));
		emplist.add(new Employee("vicky", 12000));
		
		System.out.println("\nemployees having salary above 25000");
		emplist.stream().filter(e->e.salary>25000).
		forEach(p->System.out.println(p.empName+"--"+p.salary));
		
		System.out.println("\nsorting employees based on their salary");
		emplist.stream().sorted((a,b)->Integer.compare(a.salary,b.salary)).
		forEach(p->System.out.println(p.empName+"||"+p.salary));
	}
}
