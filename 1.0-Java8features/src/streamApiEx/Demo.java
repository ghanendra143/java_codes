package streamApiEx;

import java.util.*;
import java.util.stream.Collectors;

class Product{
	int prod_id;
	String prod;
	int price;
	
	public Product(int prod_id, String prod, int price) {
		super();
		this.prod_id = prod_id;
		this.prod = prod;
		this.price = price;
	}
}

public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "laptop", 25000));
		list.add(new Product(2, "mobile", 10000));
		list.add(new Product(3, "camera", 30000));
		list.add(new Product(4, "airbuds", 12000));
		list.add(new Product(5, "smart watch", 4500));
		
		List<Product> filteredList = new ArrayList<>();
		
		// without using lamda & stream api
		for(Product p:list) {
			// filter for storing products having price above 15000rs
			if(p.price>15000) {
				filteredList.add(p);
			}
			System.out.println(p.prod_id+"--"+p.prod+"--"+p.price);
		}
		
		System.out.println("\nProducts having price above 15000");
		for(Product m:filteredList) {
			System.out.println(m.prod+"--"+m.price);
		}
		
//		list.forEach((m)->System.out.println(m.prod_id+"--"+m.prod+"--"+m.price));
		
		// Filtration by using stream 		
		List<Product> fl = list.stream().filter(i->i.price<15000).collect(Collectors.toList());
		System.out.println("\nProducts having price below 15000");
		fl.forEach((p)->System.out.println(p.prod+"--"+p.price));
		
//		for(Product p:fl) {
//			System.out.println(p.prod+"--"+p.price);
//		}
		
		//sum of all products price
		int sum = list.stream()
					  .mapToInt(e -> e.price)
					  .sum();
		System.out.println("=========================\n");
		System.out.println("sum of prices : "+sum);
		
		// max product price 
		OptionalDouble maxprice =  list.stream()
			.mapToDouble(e->e.price)
			.max();
		System.out.println("max price is : "+maxprice.getAsDouble());
		
	}
	
}

