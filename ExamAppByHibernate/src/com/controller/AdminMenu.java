package com.controller;

import java.util.Scanner;

public class AdminMenu {
	public static void Admin() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("\n------Login Required!!------\n");
		
		String adminName = "ghanendra";
		String adminPass = "gh1234";
		
		System.out.print("enter admin name : ");
		String admin_name = sc.next();
		System.out.print("enter admin pass : ");
		String admin_pass = sc.next();
		
		if(admin_name.equals(adminName) & admin_pass.equals(adminPass))
		{
			System.out.println("\n----Admin Menu----\n");
			System.out.println("1. Add Question \n"+
						       "2. Update Question \n"+
							   "3. Delete Question \n"+
							   "4. View Single student Result \n"+
							   "5. View All Student Results \n"+
							   "6. View least scoring student \n"+
							   "7. View highest scoring student \n"+
							   "8. Add valid students \n");
			System.out.print("enter your choice : ");
			
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					// Add question
					Controller.addQuestion();
					break;
				case 2:
					//Update question
					Controller.updateQuestion();
					break;
				case 3:
					//Delete question
					Controller.delQuestion();
				case 4:
					//view single student result
					Controller.viewSingleStudent();
					break;
				case 5:
					//view all student results
					Controller.viewAllStudents();
					break;
				case 6:
					//View lowest scoring student
					System.out.println("----minimum marks----");
					Controller.viewLeastScoring();
					break;
				case 7:
					//View highest scoring student
					System.out.println("----maximun marks----");
					Controller.viewHighestScoring();
					break;
				case 8:
					// add valid students
					Controller.addValidStudents();
				default:
					System.out.println("invalid choice!!");		
			 }
		}
		else
		{
			System.out.println("wrong login credeantials!!");
		}		
	}
}
