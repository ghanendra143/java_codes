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

import com.dao.CustomerDao;
import com.model.Customer;

public class Controller {
	public static Configuration conf = CustomerDao.getConfiguration();
	static Customer cust = new Customer();
	static Scanner sc = new Scanner(System.in);
	
	public static void addCustomer() {
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter Customer name : ");
		String cust_name = sc.next();
		System.out.println("Enter Customer age : ");
		int cust_age = sc.nextInt();
		System.out.println("Enter Customer Address : ");
		String cust_add = sc.next();
		
		cust.setCustName(cust_name);
		cust.setCustAge(cust_age);
		cust.setCustAddress(cust_add);
		
		session.save(cust);
		tran.commit();
		
		System.out.println("customer added successfully");
	}
	
	public static void updateCustomer() {
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		Query qr = session.createQuery("update Customer set custName=:n,custAge=:a,custAddress=:d where custId=:i");
		
		System.out.println("Enter customer id : ");
		int cust_id = sc.nextInt();
		System.out.println("Enter Customer name : ");
		String cust_name = sc.next();
		System.out.println("Enter Customer age : ");
		int cust_age = sc.nextInt();
		System.out.println("Enter Customer Address : ");
		String cust_add = sc.next();
		
		qr.setParameter("n", cust_name);
		qr.setParameter("a", cust_age);
		qr.setParameter("d", cust_add);
		qr.setParameter("i", cust_id);
		
		int row = qr.executeUpdate();
		System.out.println(row+" rows updated");
		tran.commit();
	}
	
	public static void deleteCustomer() {
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		Query qr = session.createQuery("delete Customer where custId=:i");
		
		System.out.println("Enter customer id : ");
		int cust_id = sc.nextInt();
		qr.setParameter("i", cust_id);
		int row = qr.executeUpdate();
		System.out.println(row+" rows deleted");
		tran.commit();
	}
	
	public static void displayAllCustomers() {
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Customer");
		List<Customer> customers = qr.getResultList();
		
		for (Customer c : customers) {
			System.out.println("customer id : "+c.getCustId());
			System.out.println("customer name : "+c.getCustName());
			System.out.println("customer age : "+c.getCustAge());
			System.out.println("customer address : "+c.getCustAddress());
			System.out.println("============================");
		}
		
//		Iterator<Customer> itr = customers.iterator();
//		while(itr.hasNext())
//		{
//			Customer cust = itr.next();
//			System.out.println("\ncustomer id = "+cust.getCustId()+"\n"+"customer name = "+cust.getCustName()+
//					"\n"+"customer age = "+cust.getCustAge()+"\n"+"customer address = "+cust.getCustAddress());
//		}
	}
	
	public static void displaySingleCustomer() {
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Customer where custId=:i");
		System.out.println("Enter customer id : ");
		int cust_id = sc.nextInt();
		qr.setParameter("i", cust_id);
		List<Customer> customers = qr.getResultList();
		for (Customer c : customers) {
			System.out.println("customer id : "+c.getCustId());
			System.out.println("customer name : "+c.getCustName());
			System.out.println("customer age : "+c.getCustAge());
			System.out.println("customer address : "+c.getCustAddress());
		}
		
//		Iterator<Customer> itr = customers.iterator();
//		while(itr.hasNext())
//		{
//			Customer cust = itr.next();
//			System.out.println("\ncustomer id = "+cust.getCustId()+"\n"+"customer name = "+cust.getCustName()+
//					"\n"+"customer age = "+cust.getCustAge()+"\n"+"customer address = "+cust.getCustAddress());
//		}
	}
}
