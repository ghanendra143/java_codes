package com.emp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	Calculator cal = new Calculator();

	@Test
	@Disabled
	void contextLoads() {
	}

	@Test
	@Disabled
	public void sumTest()
	{
		// a=10,b=20,c=30
		int result = cal.doSum(10, 20, 30);
		int expectedResult = 60;
		assertThat(result).isEqualTo(expectedResult);
	}
	
	@Test
	@Disabled
	public void StringTest()
	{
		// let fname = prem, lname = kumar
		String result = cal.concatString("prem", "kumar");
		String expectedResult = "prem kumar";
		assertThat(result).isEqualTo(expectedResult);
	}
	
	@Test
	@Disabled
	public void isEmptyTest()
	{
		boolean result = cal.isNameEmpty("");
		assertThat(result).isTrue();
	}
	
	@Test
	@Disabled
	public void addArrayElementTest()
	{
		int arr[] = {1,2,3};
		int result = cal.addArrayElements(arr);
		int expectedResult = 6;
		assertThat(result).isEqualTo(expectedResult);
	}
	
	@Test
	public void arrayTest()
	{
		int arr[] = {19,12,6};
		boolean result = cal.arrayElementAbove20(arr);
		boolean expectedResult = false;
		assertThat(result).isEqualTo(expectedResult);
	}
	
}
