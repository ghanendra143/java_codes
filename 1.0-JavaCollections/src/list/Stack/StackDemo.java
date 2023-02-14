package list.Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println("is stack empty? : "+st.empty());
		
		// ways to add values inside stack
		st.add(20);					
		st.addElement(56);
		st.push(10);
		st.push(34);
		st.push(67);
		st.push(99);
		
		// printing stack all elements : 
		System.out.println(st);
		
		// deleting top element : 
		st.pop();
		System.out.println("after deleting top element : "+st);
		
		// check stack is empty or not : 
		System.out.println("is stack empty? : "+st.empty());
		
		// getting top element from stack : 
		System.out.println("top element of stack is : "+st.peek());
		
		// search index of the element : 
		System.out.println("index of 56 : "+st.search(56));
	}
}
