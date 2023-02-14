package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		try {
//			System.out.println("enter value : ");
//			String value = sc.next();
//			int num = Integer.parseInt(value);
//			System.out.println("value is : " + num);
//		}
//		catch(Exception e) {
//			System.out.println("string");
//		}
		
//		Object ob = 'k';
//		System.out.println(ob.getClass().getSimpleName());
		
		int arr[] = {1,3,5,8,2,4};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
			if(arr[i]>max) {
				max = arr[i];
			}			
		}
//		System.out.println(max);
		
		List<Integer> num = Arrays.asList(1,4,2,5,8,6);
		
		// ascending order
		Collections.sort(num,(p1,p2)-> {
			return p1.compareTo(p2);
		});
		// num.forEach(e->System.out.println(e));
		
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		
//		for(Integer n:num) {
//			System.out.println(n);
//		}
		
//		System.out.println("===========================");
//		// descending order 
//		Collections.sort(num,(p1,p2)-> {
//			return p2.compareTo(p1);
//		});
//		num.forEach(e->System.out.println(e));
		
//		int a=10,b=20;
//		System.out.println(Math.min(a,b));
		
//		System.out.println(arr[3]);
	}

}
