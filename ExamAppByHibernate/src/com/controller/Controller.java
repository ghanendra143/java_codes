package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.ExamPaper;
import com.model.Student;
import com.model.ValidStudents;

public class Controller {
	
	static Scanner sc = new Scanner(System.in);
	static  ExamPaper ep = new ExamPaper();
	static ValidStudents vs = new ValidStudents();
	
	public static void addQuestion() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.print("\nenter question : ");
		String ques = sc.nextLine();
		System.out.print("enter option A : ");
		String opt1 = sc.nextLine();
		System.out.print("enter option B : ");
		String opt2 = sc.nextLine();
		System.out.print("enter option C : ");
		String opt3 = sc.nextLine();
		System.out.print("enter option D : ");
		String opt4 = sc.nextLine();
		System.out.print("enter correct answer : ");
		String real_ans = sc.nextLine();
		ep.setQuestion(ques);
		ep.setOpt1(opt1);
		ep.setOpt2(opt2);
		ep.setOpt3(opt3);
		ep.setOpt4(opt4);
		ep.setRealAnswer(real_ans);
		
		session.save(ep);
		tran.commit();
		System.out.println("\nquestion added successfully");	
	}
	
	public static void updateQuestion() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query qr = session.createQuery("update ExamPaper set question=:q,opt1=:a,opt2=:b,opt3=:c,opt4=:d,realAnswer=:r where quesId=:i");
		
		System.out.print("enter question : ");
		String ques = sc.nextLine();
		System.out.print("enter option A : ");
		String opt1 = sc.nextLine();
		System.out.print("enter option B : ");
		String opt2 = sc.nextLine();
		System.out.print("enter option C : ");
		String opt3 = sc.nextLine();
		System.out.print("enter option D : ");
		String opt4 = sc.nextLine();
		System.out.print("enter correct answer : ");
		String real_ans = sc.next();
		
		System.out.print("\nenter the ques_id : ");
		int id = sc.nextInt();
		
		qr.setParameter("q", ques);
		qr.setParameter("a", opt1);
		qr.setParameter("b", opt2);
		qr.setParameter("c", opt3);
		qr.setParameter("d", opt4);
		qr.setParameter("r", real_ans);
		qr.setParameter("i", id);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Updated");
		tran.commit();	
	}
	
	public static void delQuestion() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query qr = session.createQuery("delete from ExamPaper where quesId=:i");
		System.out.print("\nenter the ques_id : ");
		int id = sc.nextInt();
		qr.setParameter("i", id);
		int row = qr.executeUpdate();
		System.out.println(row + " Rows Deleted");
		tran.commit();
	}
	
	public static void viewSingleStudent() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Student where studId=:i"); 
		System.out.print("enter Student roll_no : ");
		int roll = sc.nextInt();
		qr.setParameter("i", roll);
		List<Student> st = qr.getResultList();
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			Student stud = itr.next();
			System.out.println("\nRoll No. = "+stud.getStudId()+"\n"+"First Name = "+stud.getStudFirstName()+"\n"+
			"Last Name = "+stud.getStudLastName()+"\n"+"Marks = "+stud.getMarks());
		}
	}

	public static void viewAllStudents() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Student"); 
		List<Student> st = qr.getResultList();
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			Student stud = itr.next();
			System.out.println("\nRoll No. = "+stud.getStudId()+"\n"+"First Name = "+stud.getStudFirstName()+"\n"+
			"Last Name = "+stud.getStudLastName()+"\n"+"Marks = "+stud.getMarks());
		}
	}
	
	public static void viewLeastScoring() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Student where marks = (select min(marks) from Student)");
		List<Student> st = qr.getResultList();
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			Student stud = itr.next();
			System.out.println("\nRoll No. = "+stud.getStudId()+"\n"+"First Name = "+stud.getStudFirstName()+"\n"+
			"Last Name = "+stud.getStudLastName()+"\n"+"Marks = "+stud.getMarks());
		}
	}
	
	public static void viewHighestScoring() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from Student where marks = (select max(marks) from Student)");
		List<Student> st = qr.getResultList();
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext())
		{
			Student stud = itr.next();
			System.out.println("\nRoll No. = "+stud.getStudId()+"\n"+"First Name = "+stud.getStudFirstName()+"\n"+
			"Last Name = "+stud.getStudLastName()+"\n"+"Marks = "+stud.getMarks());
		}
	}
	
	public static void addValidStudents() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.print("enter first_name : ");
		String fn = sc.nextLine();
		System.out.print("enter pass_code : ");
		int pc = sc.nextInt();
		
		vs.setFirstName(fn);
		vs.setPassCode(pc);
		
		session.save(vs);
		tran.commit();
		System.out.println("\nValid Student added successfully");
	}
	
	int qn=0;
	public static void viewQuestion(int qn) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		TypedQuery qr = session.createQuery("from ExamPaper where quesId=:i");
		qr.setParameter("i", qn);

		List<ExamPaper> exp = qr.getResultList();
		Iterator<ExamPaper> itr = exp.iterator();
		while(itr.hasNext()) {
			ExamPaper exam = itr.next();
			System.out.println("\n"+exam.getQuesId()+"- "+exam.getQuestion()+"\n A."+exam.getOpt1()
			+"\n B."+exam.getOpt2()+"\n C."+exam.getOpt3()+"\n D."+exam.getOpt4());
		}
	}
	
	public List<ValidStudents> stud() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		List<ValidStudents> valid = new ArrayList();
		System.out.print("Enter valid student Id : ");
		int id = sc.nextInt();
		TypedQuery qr = session.createQuery("from ValidStudents where studId=:i");
		qr.setParameter("i", id);
		List<ValidStudents> val = qr.getResultList();
		Iterator<ValidStudents> itr = val.iterator();
		while(itr.hasNext())
		{
			ValidStudents va = itr.next();
			va = new ValidStudents(va.getStudId(), va.getFirstName(), va.getPassCode());
			valid.add(va);
		}
		return valid;
	}
	
	int a=0;
	public List<ExamPaper> answer(int a) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		List<ExamPaper> list = new ArrayList();
		TypedQuery qr = session.createQuery("from ExamPaper where quesId=:i");
		qr.setParameter("i", a);
		List<ExamPaper> exp = qr.getResultList();
		Iterator<ExamPaper> itr = exp.iterator();
		while(itr.hasNext()) {
			ExamPaper ex = itr.next();
			ex = new ExamPaper(ex.getQuesId(),ex.getQuestion(),ex.getOpt1(),ex.getOpt2(),ex.getOpt3(),ex.getOpt4(),ex.getRealAnswer()); 
			list.add(ex);
		}
		return list;
	}
}
