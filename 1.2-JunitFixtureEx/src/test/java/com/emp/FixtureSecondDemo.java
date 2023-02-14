package com.emp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FixtureSecondDemo {
	
	@BeforeAll
	public static void getDBConnection() {
		System.out.println("database connection established");
	}
	
	@AfterAll
	public static void closeDBConnection() {
		System.out.println("Db connection closed");
	}
	
	@Test
	public void isEmployeePresent() {
		System.out.println("yes emp is present");
	}
	
	@Test
	public void isEmployeeAbove18() {
		System.out.println("yes emp is above 18");
	}

}
