package streamApiEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Students{
	private String fname;
	private String lname;
	private int age;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Students(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Students [fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		List<Students> list = new ArrayList<Students>();
		Students stud1 = new Students("rahul", "singh", 32);
		Students stud2 = new Students("rohit", "singh", 25);
		Students stud3 = new Students("raj", "singh", 29);
		
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);
		
//		int st = list.stream().mapToInt(n->n.getAge()).min().getAsInt();
//		System.out.println(st);
		
		// sorting by age in ascending order : 
		list.stream().mapToInt(m->m.getAge()).sorted().forEach(n->System.out.println(n));
		
		// print name of student having least age using java8 features
		 Students s = list.stream()
	                .min((x, y) -> Integer.compare(x.getAge(), y.getAge()))
	                .get();
	     System.out.println(s.getFname()+" "+ s.getLname());
	     
	     // print name of students in ascending order of their marks
	    list.stream().sorted((a,b)->Integer.compare(a.getAge(), b.getAge()))
	    .forEach(n->System.out.println(n.getFname()+"--"+n.getAge()));
	    
	    // print students in ascending order of their names : 
	    
	}
}
