package predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String eName;
	int eExp;
	int eSal;
	
	Employee(String name, int exp, int sal){
		this.eName=name;
		this.eExp=exp;
		this.eSal=sal;
	}
}

public class PredicateInterface {

	public static void main(String[] args) {
		
		// predicate interface accepts one value and returns boolean value
		
		// Example 1
		Predicate<Integer> check = i->i>10;
		System.out.println(check.test(12));
		
		// Example 2
//		check string contains more then 4 charaters or not : 
		String str = "raj";
		Predicate<String> s = a->a.length()>4;
		System.out.println(s.test(str));
		
		boolean temp = s.test(str);
		if(temp==true) {
			System.out.println("string is greater then 4 characters");
		}
		else {
			System.out.println("string is less then 4 characters");
		}
		
		// example 3
		// print array elements whose size is greater then 4 from Array
		System.out.println("\n-------- strings greater then 4 characters -------------");
		String[] names = {"rahul","ghanendra","raj","prem","dk","b","kid","citiustech"};
		for(String e:names) {
			Predicate<String> n = i->i.length()>4;
			if(n.test(e)==true) {
				System.out.println(e);
			}
		}
		
		// print names of all employees having sal<30000 && exp<3 years
		Employee emp =new Employee("rahul", 4, 40000);
		
		Predicate<Employee> pred = i->(i.eSal>30000 && i.eExp>3);
		
		if(pred.test(emp)){
			System.out.println(emp.eName);
		}
		
		// array of employees
		ArrayList<Employee> list = new ArrayList<Employee>();
		
//		Employee emp1 = new Employee("Vijay", 5, 50000);
//		Employee emp2 = new Employee("Arjun", 2, 34000);
//		Employee emp3 = new Employee("Prem",6,45000);
//		Employee emp4 = new Employee("farid", 4, 25000);
		
//		list.add(emp1);
//		list.add(emp2);
//		list.add(emp3);
//		list.add(emp4);
		
		list.add(new Employee("Vijay", 5, 50000));
		list.add(new Employee("Prem",6,45000));
		list.add(new Employee("Arjun", 2, 34000));
		list.add(new Employee("farid", 4, 25000));
		
		System.out.println("\n-----name of employees--------");
		for(Employee e:list) {
		
			if(pred.test(e)) {
				System.out.println(e.eName);
			}
		}	
	}
}
