package com.view;

import java.util.Scanner;

import com.controller.AdminMenu;
import com.controller.StudentMenu;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----Examination Managment Application----");
		System.out.println("1. Student \n"+
					       "2. Admin \n"+
						   "0. Exit \n");
		System.out.print("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			// student menu
			StudentMenu.studentMenu();	
			break;
			
			case 2:
			// admin menu
			 AdminMenu.Admin();	
			break;
			
			case 0:
				System.exit(0);
				break;
			
			default:
			System.out.println("invalid choice !!");	
		}
	}
}
