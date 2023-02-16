package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpName("rohan");
		emp.setAge(27);
		emp.setEmpSalary(20000);
		
		session.save(emp);
		tran.commit();
	}
}
