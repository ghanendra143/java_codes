package com.emp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTestClass {
	Calculator cal = new Calculator();; 
	
	@BeforeEach
	public void CalObjectCreated() {
		cal = new Calculator();
		System.out.println("object initialized");
	}
	
	@AfterEach
	public void CalObjectCleared() {
		cal = null;
		System.out.println("cal object cleared \n");
	}
	
	@Test
	public void sumTest() {
//		int result = cal.doSum(10, 12);
//		int expectedValue = 22;
		assertThat(cal.doSum(10, 12)).isEqualTo(22);
		System.out.println("ans = "+cal.doSum(10, 12));
	}
	
	@Test
	public void mulTest() {
		assertThat(cal.doMul(10, 12)).isEqualTo(120);
		System.out.println("ans = "+cal.doMul(10, 12));
	}

}
