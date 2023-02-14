package com.assertions;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsDemos {
	
	@Test
	@Disabled
	public void testArraysAreEqual() {
		char[] expected = {'r','a','h','u','l'};
		char[] actual = "rahul".toCharArray();
//		assertThat(expected).isEqualTo(actual);
//		Assertions.assertArrayEquals(expected, actual,"Both Arrays aren't Equal");
	}

	@Test
	//assertTrue
	@Disabled
	public void testAssretTrueMethodWithSimpleCondition() {
		Assertions.assertTrue(5>4,"5 is greater than 4");
	}
	
	@Test
	//assertFalse
//	@Disabled
	public void testAssreFalseMethodWithSimpleCondition() {
		Assertions.assertFalse(4>5,"5 is greater than 4");
	}
	
	
}
