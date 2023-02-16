package com.controller;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("----Customer Menu----");
		System.out.println("1. Add Customer \n"+
						   "2. Update Customer \n"+
				           "3. Delete Customer \n"+
						   "4. Display Customers \n"+
				           "5. View single customer");
		System.out.println("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			// Add Customer
				Controller.addCustomer();
				break;
			case 2:
				//Update customer
				Controller.updateCustomer();
				break;
			case 3:
				//delete customer
				Controller.deleteCustomer();
				break;
			case 4:
				// display all customers
				Controller.displayAllCustomers();
				break;
			case 5:
				Controller.displaySingleCustomer();
				break;
			default:
			System.out.println("invalid choice!!");		
		}
	}

}
