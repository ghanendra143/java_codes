package predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {

		// SupplierInterface doesn't take any inputs but returns some value

//		Supplier<Date> d = () -> new Date();
//		System.out.println(d.get());
		
		Employee empl =  new Employee("Prem", 1, 15000);
		
		Supplier<String> emp = ()->{
			return empl.eName.toUpperCase() ;
		};
		
		System.out.println(emp.get());

	}

}
