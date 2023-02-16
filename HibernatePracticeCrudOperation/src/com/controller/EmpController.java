package com.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dao.EmpDao;
import com.model.Employee;

public class EmpController {
	static Configuration conf = EmpDao.getEmpConfig();
	static Employee emp = new Employee();
	
	public static void AddEmp()
	{
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter employee name : ");
		String emp_name = sc.next();
		System.out.println("enter employee address : ");
		String emp_add = sc.next();
		System.out.println("enter employee salary : ");
		int emp_sal = sc.nextInt();
		
		emp.setEmp_name(emp_name);
		emp.setEmp_address(emp_add);
		emp.setEmp_salary(emp_sal);
		
		System.out.println("emp added successfully");
		session.save(emp);
		trans.commit();	
	}
	
	public static void DelEmp()
	{
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		Query qr = session.createQuery("delete from Employee where emp_id=:i");
		System.out.println("enter employee id : ");
		int emp_id = sc.nextInt();
		qr.setParameter("i", emp_id);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Deleted");
		trans.commit();
	}
	
	public static void UpEmp()
	{
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		Query qr = session.createQuery("update Employee set emp_name=:n,emp_address=:a,emp_salary=:s where emp_id=:i");
		System.out.println("Enter employee Id : ");
		int emp_id = sc.nextInt();
		System.out.println("Enter employee name : ");
		String emp_name = sc.next();
		System.out.println("Enter employee address : ");
		String emp_add = sc.next();
		System.out.println("Enter employee salary : ");
		int emp_sal = sc.nextInt();
		qr.setParameter("n", emp_name);
		qr.setParameter("i", emp_id);
		qr.setParameter("s", emp_sal);
		qr.setParameter("a", emp_add);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Updated");
		trans.commit();
	}
	
	public static void GetAllEmp()
	{
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		TypedQuery qr = session.createQuery("from Employee"); 
		List<Employee> emp = qr.getResultList();
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			Employee emp1 = itr.next();
			System.out.println("emp_id = "+emp1.getEmp_id()+" emp_name = "+emp1.getEmp_name()+" emp_address = "+
			emp1.getEmp_address()+" emp_salary = "+emp1.getEmp_salary());
		}
		
	}
	
	public static void GetOneEmp()
	{
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		TypedQuery qr = session.createQuery("from Employee where emp_id=:i"); 
		System.out.println("enter employee id : ");
		int emp_id = sc.nextInt();
		qr.setParameter("i", emp_id);
		List<Employee> emp = qr.getResultList();
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			Employee emp1 = itr.next();
			System.out.println("emp_id = "+emp1.getEmp_id()+" emp_name = "+emp1.getEmp_name()+" emp_address = "+
			emp1.getEmp_address()+" emp_salary = "+emp1.getEmp_salary());
		}
		
	}
	
}
