package com.controller;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("-----EMPLOYEE MAINU-----");
		System.out.println("1. Add employee\n"+
						   "2. delete employee\n"+
						   "3. update employee\n"+
						   "4. get all employees details\n"+
						   "5. get single employee");
		System.out.println("==============================");
		System.out.println("enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		EmpController ec = new EmpController();
		switch(choice)
		{
			case 1:
				// add emp
				ec.AddEmp();
				break;
			case 2:
				// delete emp
				ec.DelEmp();
				break;
			case 3:
				// update emp
				ec.UpEmp();
				break;
			case 4:
				// get all emp
				ec.GetAllEmp();
				break;
			case 5:
				ec.GetOneEmp();
				break;
			default:
				System.out.println("invalid choice");
			
		}
		
	}

}
