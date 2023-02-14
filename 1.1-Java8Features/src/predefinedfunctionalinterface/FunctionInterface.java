package predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employees{
	String eName;
	int eSalary;
	
	Employees(String name, int sal){
		this.eName=name;
		this.eSalary=sal;
	}
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		// function interface accepts one value process it and returns result
		
		// Ex-1  getting sqaure of a number :
		
		Function<Integer, Integer> sqr = n->n*n;
		System.out.println(sqr.apply(5));
		System.out.println(sqr.apply(3));
		System.out.println(sqr.apply(17));
		
		// Ex-2 get length of string 
		String  s = "ghanendra";
		Function<String, Integer> str = i->i.length();
		System.out.println("string length : "+str.apply(s));
		
		// Ex - 3 find bonus of the Employees : 
		ArrayList<Employees> emp = new ArrayList<Employees>();
		emp.add(new Employees("Vijay", 46000));
		emp.add(new Employees("Rahul", 35000));
		emp.add(new Employees("Yash", 26000));
		emp.add(new Employees("farid", 21000));
		emp.add(new Employees("Arun", 56000));
		emp.add(new Employees("Vikram", 12000));
		
		Function<Employees, Integer> empl = i->{
			int salary = i.eSalary;
			
			if(salary<15000)
				return salary*10/100;
			else if(salary<30000 && salary>15000)
				return salary*20/100;
			else if (salary<45000 && salary>30000)
				return salary*30/100;
			else if (salary<60000 && salary>45000)
				return salary*40/100;
			else
				return salary*5/100;
		};
		
		Predicate<Integer> top = i->i<10000; 
		
		int bonus = 0;
		for(Employees e:emp) {
			bonus = empl.apply(e);
			System.out.println("Employee name : "+e.eName+"--"+"Bonus : "+bonus);
			
			if(top.test(bonus)){
				System.out.println("top performers : ");
				System.out.println(e.eName+"--"+e.eSalary+"--"+bonus);
			}	
		}
	}
}
