package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
		
		// for loop for calculating power
//		int base=5,power=3;
//		int ans=1;
//		for(int i=1;i<=power;i++) {
//				ans = ans*base;
//		}
//		System.out.println(base+"^"+power+" : "+ans);
		
		// math function for calculating power
//		double result = Math.pow(base, power);
//		System.out.println(result);
		
		// calculating power using lambda_expression : 
		Functional_Interface fn = (x,y)->System.out.println(Math.pow(x, y));
		fn.num(2, 3);
		
		// calculating squares 
		List<Integer> num = Arrays.asList(3,4,7,5,9);
		List<Integer> squares = num.stream().map(n -> n*n).collect(Collectors.toList());     
		System.out.println(squares);
		
//		num.stream().map(n -> n*n).collect(Collectors.toList()).forEach(System.out::println);
	}

}
