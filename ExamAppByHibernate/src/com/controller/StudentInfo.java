package com.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.ExamPaper;
import com.model.Student;

public class StudentInfo {
	
	public static void StudentDetail() {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf =conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		Controller con = new Controller();
		
		System.out.println("\n========= Enter your details =========\n");
		System.out.print("Enter your first_name : ");
		String fn = sc.next();
		System.out.print("Enter your last_name : ");
		String ln = sc.next();
		System.out.print("Enter your roll no : ");
		int roll = sc.nextInt();
		
		System.out.println("\n-----JAVA MockTest-----");
		int score = 0;
		
		List<ExamPaper> list1 = con.answer(1);
		for (Iterator iterator1 = list1.iterator(); iterator1.hasNext();) {
			ExamPaper examPaper = (ExamPaper) iterator1.next();
			String answer1 = examPaper.getRealAnswer();
			Controller.viewQuestion(1);
			System.out.print("enter ans.1 = ");
			String ans1 = sc.next();
			if(ans1.equalsIgnoreCase(answer1))
			{
				score=score+2;
			}
		}
		
		List<ExamPaper> list2 = con.answer(2);
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			ExamPaper examPaper = (ExamPaper) iterator.next();
			String answer2 = examPaper.getRealAnswer();
			Controller.viewQuestion(2);
			System.out.print("enter ans.2 = ");
			String ans2 = sc.next();
			if(ans2.equalsIgnoreCase(answer2))
			{
				score=score+2;
			}
		}
		
		List<ExamPaper> list3 = con.answer(3);
		for (Iterator iterator = list3.iterator(); iterator.hasNext();) {
			ExamPaper examPaper = (ExamPaper) iterator.next();
			String answer3 = examPaper.getRealAnswer();
			Controller.viewQuestion(3);
			System.out.print("enter ans.3 = ");
			String ans3 = sc.next();
			if(ans3.equalsIgnoreCase(answer3))
			{
				score=score+2;
			}
		}
		
		List<ExamPaper> list4 = con.answer(4);
		for (Iterator iterator = list4.iterator(); iterator.hasNext();) {
			ExamPaper examPaper = (ExamPaper) iterator.next();
			String answer4 = examPaper.getRealAnswer();
			Controller.viewQuestion(4);
			System.out.print("enter ans.4 = ");
			String ans4 = sc.next();
			if(ans4.equalsIgnoreCase(answer4))
			{
				score=score+2;
			}
		}
		
		List<ExamPaper> list5 = con.answer(5);
		for (Iterator iterator = list5.iterator(); iterator.hasNext();) {
			ExamPaper examPaper = (ExamPaper) iterator.next();
			String answer5 = examPaper.getRealAnswer();
			Controller.viewQuestion(5);
			System.out.print("enter ans.5 = ");
			String ans5 = sc.next();
			if(ans5.equalsIgnoreCase(answer5))
			{
				score=score+2;
			}
		}
		
		stud.setStudId(roll);
		stud.setStudFirstName(fn);
		stud.setStudLastName(ln);
		stud.setMarks(score);
		
		session.save(stud);
		tran.commit();
		System.out.println("\nStudent added successfully");
		
		System.out.println("\nEnter your roll_no below to view your result : \n");
		con.viewSingleStudent();
		
		System.out.print("\npress 1 to generate a textfile of your ReportCard : ");
		int num = sc.nextInt();
		if(num==1)
		{
			try {
			      File report = new File("C:\\Users\\GhanendraS\\eclipse-workspace\\ExamAppByHibernate\\ReportCard\\ReportCard.txt");
			      if (report.createNewFile()) {
			        System.out.println("ReportCard Generated : " + report.getName());
			        System.out.println("file location : " + report.getAbsolutePath());
			      } else {
			        System.out.println("File already exists.");
			        System.out.println("file location : " + report.getAbsolutePath());
			      }
			      FileWriter myWriter = new FileWriter("C:\\Users\\GhanendraS\\eclipse-workspace\\ExamAppByHibernate\\ReportCard\\ReportCard.txt");
			      myWriter.write("======Student Marksheet======\n");
			      myWriter.write("Roll_No = "+roll+"\n"+"First_Name = "+fn+
			    		  "\n"+"Last_Name = "+ln+"\n"+"Marks = "+score+"/10");  
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			      System.exit(0);
			    } 
			catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
	}
}	