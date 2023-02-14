package streamApiEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

public class FilterDemos {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,2,34,11,31,47,68);
		
		// filter even numbers
		List<Integer> fl = list.stream().filter(p->p%2==0).collect(Collectors.toList());
		fl.forEach(System.out::println);
//		fl.forEach(p->System.out.println(p));
		
		// Stream iterating example
		System.out.println("-----------------------");
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(10).forEach(System.out::println);
		
		// filtration of string having length less than 5
		System.out.println("\n-----names having length less than 5");
		List<String> list2 = Arrays.asList("rahul", "raju", "priyanka", "uma", "vikas");
		List<String> strList =  list2.stream().filter(str->str.length()>=5).collect(Collectors.toList());
		strList.forEach(System.out::println);
		
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(1, "rahul", 78));
		stud.add(new Student(2, "rohit", 57));
		stud.add(new Student(3, "yash", 35));
		stud.add(new Student(4, "prem", 89));
		stud.add(new Student(5, "abhi", 56));
		System.out.println("\n=====Students having marks above 75");
		List<Student> st = stud.stream().filter(p->p.marks>75).collect(Collectors.toList());
		st.forEach(stu->System.out.println(stu.name+"--"+stu.marks));
		
		// reduce method
		Integer st2 = stud.stream().map(p->p.marks).reduce(0,(sum,marks)->sum+marks);
		System.out.println("total marks : "+st2);
		
		// sum by using collectors method
		// converting marks from into double
		double stud_marks =  stud.stream().collect(Collectors.summingDouble(p->p.marks));
		System.out.println("total marks in double : "+stud_marks);
		
		// finding max and min value 
		Student maxMarks = stud.stream().max((m1,m2)->m1.marks>m2.marks? 1:-1).get();
		System.out.println("maximum marks : "+maxMarks.marks);
		
		Student minMarks = stud.stream().min((m1,m2)->m1.marks>m2.marks? 1:-1).get();
		System.out.println("minimum marks : "+minMarks.marks);
	
		// count 
		long count = stud.stream().filter(c->c.marks>50).count();
		List<Student> top = stud.stream().filter(s->s.marks>50).collect(Collectors.toList());
		System.out.println("\n==============");
		System.out.println("no. of students having marks above 50 : " + count);
		top.forEach(m->System.out.println(m.name+"--"+m.marks));
		
		// convert list into set
		Set<Student> topper =  stud.stream().filter(s->s.marks>75).collect(Collectors.toSet());
		System.out.println("\nstudents having marks above 75 : ");
		topper.forEach(m->System.out.println(m.name+"--"+m.marks));
		
		// convert list into map 
		Map<String,Integer> map = stud.stream().collect(Collectors.toMap(p->p.name, p->p.marks));
		System.out.println("\nlist to map conversion : ");
		System.out.println(map);
		
		// method reference in stream
		List<Integer> s = stud.stream().filter(p->p.marks>50).map(Student::getMarks).collect(Collectors.toList());
		System.out.println("\n===============\nmethod reference in stream");
		s.forEach(System.out::println);
	}

}
