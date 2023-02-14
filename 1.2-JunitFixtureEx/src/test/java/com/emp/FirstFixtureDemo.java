package com.emp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstFixtureDemo {

	@BeforeEach
	public void setUp() {
		System.out.println("this is setup method runs before every test case");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("this is teardown method runs after every test case\n");
	}

	@Test
	public void Test1() {
		System.out.println("test 1");
	}

	@Test
	public void Test2() {
		System.out.println("test 2");
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}

}
