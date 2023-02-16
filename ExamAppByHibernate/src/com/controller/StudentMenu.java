package com.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.model.ValidStudents;

public class StudentMenu {
	
	public static void instructions()
	{
		System.out.println("\n-----important instruction----\n");
		System.out.println("1. All question are cumpolsory \n"+
					       "2. Total 5 questions are in present in the question paper \n"+
					       "3. Each question carries of 2 marks \n"+
						   "4. no negative marking ");
	}
	
	public static void studentMenu() {
		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();
		
		System.out.println("\n-------------Student Menu----------");
		
		List<ValidStudents> valid = con.stud();
		System.out.print("enter your first_name = ");
		String firstName = sc.next();
		System.out.print("enter your pass code = ");
		int passCode = sc.nextInt();
		
		for (Iterator iterator = valid.iterator(); iterator.hasNext();) {
			ValidStudents validStudents = (ValidStudents) iterator.next();
			String fn1 = validStudents.getFirstName();
			int pass1 = validStudents.getPassCode();
			
			if(firstName.equalsIgnoreCase(fn1) && passCode==pass1)
			{
				System.out.println("\nyou are a valid student !!");
				instructions();
				StudentInfo.StudentDetail();
			}
			else
			{
				System.out.println("invalid student!!");
			}
		}	
	}
}