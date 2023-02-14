package predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ConsumerInterface {

	public static void main(String[] args) {
		
		// Consumer interface accepts single value and returns no value
		
//		Ex- 1 printing string and integer values
		Consumer<String> str = i->System.out.println(i);
		str.accept("hi, how are you");
		
		Consumer<Integer> num = i->System.out.println(i*i);
		num.accept(2);
		
		// Ex-2  calculate bonus and print employees having bonus above 5000
		
		// Employee class is declared in the PredicateInterface class.
		
		ArrayList<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee("Rahul",4,45000));  // name,experience,salary
		emplist.add(new Employee("Rohan",3,35000));
		emplist.add(new Employee("Vimal",6,65000));
		emplist.add(new Employee("Prem",1,15000));
		emplist.add(new Employee("Yash",7,85000));
		
		Function<Employee, Integer> b = i->i.eSal*10/100;  // apply method
		
//		Consumer<Employee> emp = i->{
//			System.out.println(i.eName+"--"+i.eSal+"--"+bonus);    // accept method
//		};
		
		Predicate<Integer> ab = i->i>5000;			// test method
		
		for(Employee e:emplist) {
			int bonus = b.apply(e);		// invoking function
			
			Consumer<Employee> emp = i->{
				System.out.println("Employee Name : "+i.eName+" || "+"Salary : "+i.eSal+" || "+"Bonus : "+bonus);    // accept method
			};
			
			if(ab.test(bonus)) {	// invoking predicate
				emp.accept(e); 		// invoking consumer
				// System.out.println("Employee name : "+e.eName+" Bonus : "+bonus);
			}
		}	
	}
}
