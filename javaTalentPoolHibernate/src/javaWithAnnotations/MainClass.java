package javaWithAnnotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("javaWithAnnotations/employee.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("\nconnected \n");
		Employee emp = new Employee();
		emp.setEmp_name("joseph");
		emp.setEmp_dept("android");
		emp.setEmp_salary(35000);
		
		System.out.println("data inserted");
		tran.commit();
		session.save(emp);
		session.close();

	}

}
