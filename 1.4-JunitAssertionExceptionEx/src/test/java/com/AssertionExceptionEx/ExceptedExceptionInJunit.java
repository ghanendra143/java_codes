package com.AssertionExceptionEx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExceptedExceptionInJunit {
	
	@Test
	@Disabled
	public void testThrowsExceptionAssert() {
		NumberFormatException exception= Assertions.assertThrows(NumberFormatException.class,
				()->{
			Integer.parseInt("aa");
		});
		String expected_error_message="For input string";
		String actual_error_message=exception.getMessage();
		Assertions.assertTrue(actual_error_message.contains(expected_error_message));	
	}
	
	@Test
	public void test_ArithmeticException() {
		ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class,()->
		{
			int res=12/0;
		});
		//    / by zero
		String expected_error_message="/ by zero";
		String actual_error_message=exception.getMessage();
		Assertions.assertTrue(actual_error_message.contains(expected_error_message));
		
	}

}
