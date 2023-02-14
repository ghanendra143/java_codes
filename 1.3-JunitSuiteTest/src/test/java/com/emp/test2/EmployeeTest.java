package com.emp.test2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.emp.test.EmployeeInfo;

@DisplayName("Emptest2")
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
	@Tag("test2_fullname")
	public void testEmpFullName() {
		assertThat(emp.empFullName("prem", "kumar")).isEqualTo("prem kumar");
	}
	
	@Test
	@Tag("test2_salary")
	public void testEmpSalary() {
		assertThat(emp.empSalary(3000, 500)).isEqualTo(3500);
	}

	@Test
	public void testEmpAge() {
		assertThat(emp.empAge(31)).isEqualTo(true);
	}
}
