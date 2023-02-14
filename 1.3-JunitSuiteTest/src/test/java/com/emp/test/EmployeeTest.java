package com.emp.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Emptest1")
public class EmployeeTest {
	EmployeeInfo emp;
	
	@BeforeEach
	public void empObjectInitialized() {
		emp = new EmployeeInfo();
	}
	
	@AfterEach
	public void empObjectCleared() {
		emp = null;
	}
	
	@Test
	@Tag("test1_fullname")
	public void testEmpFullName() {
		assertThat(emp.empFullName("rahul", "kumar")).isEqualTo("rahul kumar");
	}
	
	@Test
	public void testEmpSalary() {
		assertThat(emp.empSalary(2000, 200)).isEqualTo(2200);
	}

	@Test
	public void testEmpAge() {
		assertThat(emp.empAge(21)).isEqualTo(true);
	}
}
