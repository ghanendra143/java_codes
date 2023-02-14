package com.emp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class NumberBasedOrder {
	public static StringBuffer myString = new StringBuffer();
	
	@Test
	@Order(3)
	public void myAtest() {
		myString.append("A");
		System.out.println("A test");
	}

	@Test
	@Order(1)
	public void myCtest() {
		myString.append("C");
		System.out.println("C test");
	}
	
	@Test
	@Order(2)
	public void myBtest() {
		myString.append("B");
		System.out.println("B test");
	}
	
	@AfterAll
	public static void testOrder() {
		assertThat(myString.toString()).isEqualTo("CBA");
		System.out.println("correct order = CBA");
	}
}

