package lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

interface demoInterface{
	public void num();
}

interface sayHello {
	public void say();
}

interface sayHii {
	public String say();
}

interface multiply {
	int mul(int a, int b);
}

interface strlen {
	int getlen(String stri);
}

class Product{
	String prod_name;
	int price;
	String date;

	public Product(String prod_name, int price, String date) {
		super();
		this.prod_name = prod_name;
		this.price = price;
		this.date = date;
	}
	 
}

public class demo1 {
	
	public static void main(String[] args) {
		int num = 10;
		
		// without lambda
		demoInterface di = new demoInterface() {
			
			@Override
			public void num() {
				System.out.println("number is : " + num);	
			}
		};
		di.num();
		
//		------------ with lamda ------------------------
		demoInterface di2 = () -> {
			System.out.println("(lambda)number is : " + num);
		};
		di2.num();
		
		// no parameter 
		sayHello hello =  () -> {
			System.out.println("hii, ghanendra this side");
		};
		hello.say();
		
		// with return keyword
		sayHii hi = () -> {
			return "have a good day!!"; 
		};
		System.out.println(hi.say());
		
		// with parameter
		// double parameter
		Calculator cal = (a,b) -> System.out.println("sum of "+a+" and "+b+ " is : " + (a+b));
		cal.num(10, 5);
		
		Calculator calc = (a,b) -> System.out.println("multiply of "+a+" and "+b+" is : "+ a*b);
		calc.num(12, 8);
		
		multiply product = (a,b) -> (a*b);
		System.out.println("multiplication is : " + product.mul(5, 8));
		
		// single parameter
//		strlen len = stri -> stri.length();
//		System.out.println("enter name : ");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		System.out.println("string length of "+ name + " is : " + len.getlen(name));
		
		// for each loop
		List<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("yash");
		list.add("prem");
		list.add("priya");
		list.add("komal");
		
		// without lamda
		System.out.println("\nwithout lamda - ");
		for (String e : list) {
			System.out.println("\t"+e);
		}
		
		// with lamda forEach
		System.out.println("with lamda - ");
		list.forEach((m)-> System.out.println("\t"+m));
		
		// with comparator 
		List<Product> prod = new ArrayList<Product>();
		prod.add(new Product("lenovo", 80000, "20/10/2021"));
		prod.add(new Product("realme", 7000, "20/02/2020"));
		prod.add(new Product("boat", 1500, "02/03/2022"));
		prod.add(new Product("truke", 1200, "02/02/2022"));
		
		Collections.sort(prod,(p1,p2)-> {
			return p1.prod_name.compareTo(p2.prod_name);
		});
		
		prod.forEach((p)-> System.out.println(p.prod_name+"--"+p.price+"--"+p.date));
		
		// using lambda to filter data
		Stream<Product> filterData = prod.stream().filter(p->p.price>5000);
		System.out.println("\nproducts having price > 5000 are : ");
		filterData.forEach((p)->System.out.println(p.prod_name+"--"+p.price));
		
	}	
}
