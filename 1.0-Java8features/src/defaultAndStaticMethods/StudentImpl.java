package defaultAndStaticMethods;

public class StudentImpl implements Student{

	@Override
	public void dMethod() {
		System.out.println("this is overridden method");
	}
	
	public static void main(String[] args) {
		StudentImpl st = new StudentImpl();
		
		// calling dMethod from Student interface
		st.dMethod();
		
		// calling sMethod from Student interface
		Student.sMethod();

	}

}
