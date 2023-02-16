package JDBC;

public class Employee {
	
	int id;
	String emp_name;
	int emp_sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}
	
	public Employee(int id, String emp_name, int emp_sal) {
		super();
		this.id = id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}
	
	
}
