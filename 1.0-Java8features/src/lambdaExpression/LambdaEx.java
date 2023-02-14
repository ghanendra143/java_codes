package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

interface Inter1 {
	public String say();
}

@FunctionalInterface
interface Inter2
{
	public int sum(int a, int b);
}
		
public class LambdaEx {
	public static void main(String[] args) {
		
		// without parameter 
		 Inter1 inter = ()-> {return "hey whatsup!!";};
		 System.out.println(inter.say());
		
		// with 2 parameter
		 Inter2 face = (a,b)-> {return a+b;};
		 System.out.println(face.sum(3, 13) + "\n");
		 
		// with for each loop 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(23);
		 list.add(12);
		 list.add(67);
		 list.add(56);
		 list.add(87);
		 
		 // without lambda
//		 for(int e:list) {
//			 System.out.println(e);
//		 }
		 
		 // with lambda
		 list.forEach((e)->System.out.println(e));
		 
		 // sorting list in ascending form 
		 Collections.sort(list);
		 System.out.println(list);
	}

}
