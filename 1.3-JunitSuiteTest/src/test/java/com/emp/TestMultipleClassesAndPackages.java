package com.emp;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.emp.test2.EmployeeTest;

@Suite
//@SelectPackages({"com.emp.test","com.emp.test2"})
@SelectClasses({EmployeeTest.class})
@ExcludeTags({"test2_fullname","test2_salary","test1_fullname"})
public class TestMultipleClassesAndPackages {
	
}
