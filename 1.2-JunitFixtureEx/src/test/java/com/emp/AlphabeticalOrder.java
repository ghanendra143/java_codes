package com.emp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AlphabeticalOrder {
	public static StringBuffer myString = new StringBuffer();
	
	@Test
	public void myAtest() {
		myString.append("A");
		System.out.println("A test");
	}

	@Test
	public void myCtest() {
		myString.append("C");
		System.out.println("C test");
	}
	
	@Test
	public void myBtest() {
		myString.append("B");
		System.out.println("B test");
	}
	
	@AfterAll
	public static void testOrder() {
		assertThat(myString.toString()).isEqualTo("ABC");
		System.out.println("correct order = ABC");
	}
}

